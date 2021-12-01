package com.sparta.StarProjectLocationDB.dto;

import com.sparta.StarProjectLocationDB.City;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LocationStarMoonDustDto {
    List<StarGazingDto> starGazing;
    SunMoonDto moon;
    List<WeatherApiDto2> weather;
    DustApiDto dust;
    City city;
    GeographicDto geographicDto;
}
