package com.sparta.StarProjectLocationDB.scheduled;

import com.sparta.StarProjectLocationDB.City;
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
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpServerErrorException;

import javax.transaction.Transactional;
import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
@EnableScheduling
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

            deleteStarDb();
            deleteWeatherDB();

            int starCount = 0;
            for (City city : City.values()) {
                LocationStarMoonDustDto infoByAddress = api.findInfoByAddress(city.getKorName(), starCount);
                api.saveStarLocationWeather(count, infoByAddress);
                starCount++;
            }
        }
        catch (HttpServerErrorException httpServerErrorException){
            log.info("httpServer Error = {}",httpServerErrorException.getMessage());
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
