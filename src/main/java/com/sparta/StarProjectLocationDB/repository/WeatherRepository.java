package com.sparta.StarProjectLocationDB.repository;

import com.sparta.StarProjectLocationDB.domain.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeatherRepository extends JpaRepository<Weather, Long> {

    List<Weather> findAllByPredictTime(String predictTime);
}
