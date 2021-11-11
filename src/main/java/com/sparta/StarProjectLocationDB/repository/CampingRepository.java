package com.sparta.StarProjectLocationDB.repository;

import com.sparta.StarProjectLocationDB.domain.board.Camping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampingRepository extends JpaRepository<Camping, Long> {
}
