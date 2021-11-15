package com.sparta.StarProjectLocationDB.scheduled;

import com.sparta.StarProjectLocationDB.api.API;
import com.sparta.StarProjectLocationDB.api.CampingList;
import com.sparta.StarProjectLocationDB.api.StellaList;
import com.sparta.StarProjectLocationDB.api.accuweatherAPI.StarGazingCity;
import com.sparta.StarProjectLocationDB.domain.Location;
import com.sparta.StarProjectLocationDB.domain.StarInfo;
import com.sparta.StarProjectLocationDB.domain.User;
import com.sparta.StarProjectLocationDB.domain.board.Camping;
import com.sparta.StarProjectLocationDB.dto.LocationStarMoonDustDto;
import com.sparta.StarProjectLocationDB.exception.ErrorCode;
import com.sparta.StarProjectLocationDB.exception.StarProjectException;
import com.sparta.StarProjectLocationDB.repository.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpServerErrorException;

import javax.transaction.Transactional;
import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class Schedule {
    private static int count = 0;
    private final static int day = 1000 * 60 * 60 * 24;

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final API api;
    private final CampingRepository campingRepository;
    private final LocationRepository locationRepository;
    private final StarInfoRepository starInfoRepository;
    private final WeatherRepository weatherRepository;
    private final StarRepository starRepository;

    @Scheduled(fixedDelay = day) // scheduler 끝나는 시간 기준으로 1000 간격으로 실행
    public void scheduleDelayTask() throws Exception {
        try{
            if (count == 0){
                User user = new User("root", passwordEncoder.encode("asdf"), "별이빛나는 밤");
                userRepository.save(user);

                for (StellaList value : StellaList.values()) {
                    StarInfo starInfo = new StarInfo(value.getImg(), value.getName(), value.getComment(), value.getMonth().toString());
                    starInfoRepository.save(starInfo);
                }
            }

            deleteStarDb();
            deleteWeatherDB();

            User root = userRepository.findByUsername("root").orElseThrow(
                    () -> new StarProjectException(ErrorCode.USERNAME_NOT_FOUND)
            );

            int starCount = 0;
            for (StarGazingCity city : StarGazingCity.values()) {
//                if(starCount >10)
//                    break;
                LocationStarMoonDustDto infoByAddress = api.findInfoByAddress(city.getKorName(), starCount);
                api.saveStarLocationWeather(count, infoByAddress);
                starCount++;
            }

            if (count == 0) {
                for (CampingList value : CampingList.values()) {
                    List<String> strings = api.processAddress(value.getAddress());

                    Location findLocation = locationRepository.findByCityName(strings.get(0));

                    Camping campingData = new Camping(value.getName(), value.getAddress(),
                            value.getAddress(), value.getImgSrc(), value.getLocationX(), value.getLocationY(), root, findLocation, "campingData");
                    campingRepository.save(campingData);
                }
            }
        }
        catch (HttpServerErrorException httpServerErrorException){
            log.info("httpServer Error");
        }

        log.info("업뎃 횟수 = {}", count);
        count++;
    }

    @Transactional
    public void deleteWeatherDB(){
        weatherRepository.deleteAll();
    }


    @Transactional
    public void deleteStarDb(){
        starRepository.deleteAll();
    }

}
