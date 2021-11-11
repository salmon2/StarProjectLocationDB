package com.sparta.StarProjectLocationDB.domain.board;



import com.sparta.StarProjectLocationDB.domain.Location;
import com.sparta.StarProjectLocationDB.domain.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@DiscriminatorValue("Camping")
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Camping extends Board{

    private String campingData;

    public Camping(String locationName, String address, String content, String img, Double longitude, Double latitude, User user, Location location, String campingData) {
        super(locationName, address, content, img, longitude, latitude, user, location);
        this.campingData = campingData;
    }
}
