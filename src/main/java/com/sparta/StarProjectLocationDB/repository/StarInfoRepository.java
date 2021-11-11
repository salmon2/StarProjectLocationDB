package com.sparta.StarProjectLocationDB.repository;

import com.sparta.StarProjectLocationDB.domain.StarInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StarInfoRepository extends JpaRepository<StarInfo, Long> {
    StarInfo findByMonth(String month);
}
