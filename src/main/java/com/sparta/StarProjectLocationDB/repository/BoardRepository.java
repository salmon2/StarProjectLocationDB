package com.sparta.StarProjectLocationDB.repository;


import com.sparta.StarProjectLocationDB.domain.board.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    @Query("SELECT e " +
            "FROM Board e " +
            "GROUP BY e.like " +
            "ORDER BY COUNT(e.like) DESC")
    public List<Board> findBoardDto();



}
