package com.sparta.StarProjectLocationDB.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MainDto {
    private String title;
    private String address;
    private String contents;
    private Long StarGazing;
    private String img;
}
