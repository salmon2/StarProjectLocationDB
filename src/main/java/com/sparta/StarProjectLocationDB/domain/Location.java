package com.sparta.StarProjectLocationDB.domain;


import com.sparta.StarProjectLocationDB.domain.board.Board;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Location {
    @Id @GeneratedValue
    private Long id;

    private String cityName;

    private String state;
    private String img;

    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Board> board = new ArrayList<>();

    @OneToOne(mappedBy = "location", fetch = FetchType.LAZY)
    private Star star;

    @OneToMany(mappedBy = "location", fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    private List<Weather> weatherList = new ArrayList<>();


    public Location(String cityName) {
        this.cityName = cityName;
    }

    public Location(String cityName, String state) {
        this.cityName = cityName;
        this.state = state;
    }
}
