package com.sparta.StarProjectLocationDB.domain.board;


import com.fasterxml.jackson.annotation.JsonIgnore;

import com.sparta.StarProjectLocationDB.domain.HashTag;
import com.sparta.StarProjectLocationDB.domain.Like;
import com.sparta.StarProjectLocationDB.domain.Location;
import com.sparta.StarProjectLocationDB.domain.User;
import com.sparta.StarProjectLocationDB.dto.BoardDto;
import lombok.*;
import org.hibernate.annotations.BatchSize;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;

@Entity
@BatchSize(size = 100)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
@Getter @Setter
@ToString   //문자열
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Table(name = "Board")
@EntityListeners(AuditingEntityListener.class)
public class Board extends Timestamped{

    @Id @GeneratedValue
    private Long id;

    private String title;
    private String address;
    @Column( length = 100000 )
    private String content;
    @Column( length = 100000 )
    private String img;

    private Double longitude;
    private Double latitude;


    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "location_id")
    @JsonIgnore
    private Location location;

    @OneToMany(mappedBy = "board", fetch = LAZY, cascade = ALL)
    private Set<Like> like = new HashSet<>();

    @OneToMany(mappedBy = "board", fetch = LAZY, cascade = ALL)
    private List<HashTag> hashTagList = new ArrayList<>();

    public Board(String title, String address, String content, String img, Double longitude, Double latitude, User user, Location location) {
        this.title = title;
        this.address = address;
        this.content = content;
        this.img = img;
        this.longitude = longitude;
        this.latitude = latitude;
        this.user = user;
        this.location = location;
    }

    public Board(String address,String content,String img,String title, User user){
        this.title = title;
        this.address = address;
        this.img = img;
        this.content = content;
        this.user = user;
    }
    public Board(String address,String content,String img,String title){
        this.title = title;
        this.address = address;
        this.img = img;
        this.content = content;
    }

    public void update(BoardDto boardDto){
        this.title = title;
        this.address = address;
        this.img = img;
        this.content = content;
    }
}
