package com.sparta.StarProjectLocationDB.repository;


import com.sparta.StarProjectLocationDB.domain.Star;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StarRepository  extends JpaRepository<Star, Long> {
    List<Star> findTop3ByOrderByStarGazingDesc();
    List<Star> findAllByOrderByStarGazingDesc();
}
