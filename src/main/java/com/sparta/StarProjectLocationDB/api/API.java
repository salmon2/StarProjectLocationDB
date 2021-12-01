package com.sparta.StarProjectLocationDB.api;

import com.sparta.StarProjectLocationDB.City;
import com.sparta.StarProjectLocationDB.api.accuweatherAPI.AccuWeatherApi;
import com.sparta.StarProjectLocationDB.api.accuweatherAPI.StarGazingCity;
import com.sparta.StarProjectLocationDB.api.dustApi.DustApi;
import com.sparta.StarProjectLocationDB.api.dustApi.DustCity;
import com.sparta.StarProjectLocationDB.api.locationAPI.AddressToGps;
import com.sparta.StarProjectLocationDB.api.moonRiseAPI.MoonAPI;
import com.sparta.StarProjectLocationDB.api.moonRiseAPI.MoonCity;
import com.sparta.StarProjectLocationDB.api.weatherAPI.WeatherApi;
import com.sparta.StarProjectLocationDB.api.weatherAPI.WeatherCity;
import com.sparta.StarProjectLocationDB.domain.Location;
import com.sparta.StarProjectLocationDB.domain.Star;
import com.sparta.StarProjectLocationDB.domain.Weather;
import com.sparta.StarProjectLocationDB.dto.*;
import com.sparta.StarProjectLocationDB.repository.LocationRepository;
import com.sparta.StarProjectLocationDB.repository.StarRepository;
import com.sparta.StarProjectLocationDB.repository.WeatherRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class API {
    private final AccuWeatherApi accuWeatherApi;
    private final DustApi dustApi;
    private final MoonAPI moonAPI;
    private final WeatherApi weatherApi;
    private final AddressToGps addressToGps;

    private final LocationRepository locationRepository;
    private final StarRepository starRepository;
    private final WeatherRepository weatherRepository;


    //주소를 city로 찾기
    public City processAddressReturnCity(String address){
        for (City value : City.values()) {
            if(address.contains(value.getKorName())){
                return value;
            }
        }
        return null;
    }



    //외부 api 쏘기
    public LocationStarMoonDustDto findInfoByAddress(String address, int count) throws Exception {
        City city = processAddressReturnCity(address);    //경상북도 구미시, 구미
                                                            //서울특별시 ~~, 서울
        log.info("city = {}, state ={}", city.getKorName(), city.getState());
        WeatherCity weatherCity = WeatherCity.getWeatherCityByString(city.getKorName());
        MoonCity moonCity = MoonCity.getMoonCityByString(city.getKorName(), city.getState());
        DustCity dustCity = DustCity.getDustCityByString(city.getState());
        StarGazingCity starGazingCity = StarGazingCity.getStarGazingCityByString(city.getKorName());


        log.info("weatherCity = {}",weatherCity);
        log.info("moonCity = {}",moonCity);
        log.info("dustCity = {}",dustCity);
        log.info("starGazingCity = {}",starGazingCity);

        List<StarGazingDto> starGazing = null;
        SunMoonDto moon = null;
        List<WeatherApiDto2> weather = null;
        DustApiDto dust = null;
        GeographicDto geographicDto = null;

        do{
            starGazing = accuWeatherApi.getStarGazing(starGazingCity, count);
        }while(starGazing == null);
        do{
            moon = moonAPI.getMoon(moonCity);
        }while(moon == null);
        do{
            weather = weatherApi.getWeather(weatherCity);
        }while(weather == null);
        do{
            dust = dustApi.getDust(dustCity);
        }while(dust == null);

        do{
            geographicDto = addressToGps.getAddress(address);
        }while(geographicDto ==null);

        LocationStarMoonDustDto result = new LocationStarMoonDustDto(
                starGazing,
                moon,
                weather,
                dust,
                city,
                geographicDto
        );


        return result;
    }

    //외부 api 쏜거 저장하기
    @Transactional
    public Location saveStarLocationWeather(int count, LocationStarMoonDustDto result) {
        Location newLocation = null;
        Location saveLocation = null;

        saveLocation = locationRepository.findByCityName(result.getCity().getKorName());


        Star newStar =
                new Star(
                    result.getMoon().getMoonrise(),
                    result.getMoon().getMoonSet(),
                    Long.valueOf(result.getStarGazing().get(0).getValue().longValue()),
                    saveLocation
                );
        starRepository.save(newStar);

        for (WeatherApiDto2 weatherApiDto2 : result.getWeather()) {
            Weather newWeather = new Weather(
                            weatherApiDto2.getHumidity(),
                            weatherApiDto2.getWeather(),
                            weatherApiDto2.getTemperature(),
                            weatherApiDto2.getMaxTemperature(),
                            weatherApiDto2.getMinTemperature(),
                            weatherApiDto2.getPrecipitationProbability(),
                            weatherApiDto2.getFcstTime(),
                            result.getDust().getPm10Value(),
                            weatherApiDto2.getBaseDate(),
                            saveLocation);

            weatherRepository.save(newWeather);
        }

        return saveLocation;
    }

}
