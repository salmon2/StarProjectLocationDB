package com.sparta.StarProjectLocationDB.repository;


import com.sparta.StarProjectLocationDB.domain.board.UserMake;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserMakeRepository extends JpaRepository<UserMake, Long> {
}
