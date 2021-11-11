package com.sparta.StarProjectLocationDB.repository;


import com.sparta.StarProjectLocationDB.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<Location, String> {
    Location findByCityName(String cityName);
    List<Location> findAllByOrderByCityNameDesc();
}
