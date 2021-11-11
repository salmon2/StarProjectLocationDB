package com.sparta.StarProjectLocationDB.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sparta.StarProjectLocationDB.domain.board.Board;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class HashTag {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "board_id")
    @JsonIgnore
    private Board board;

    private String hashTagContent;

    public HashTag(Board board, String hashTagContent) {
        this.board = board;
        this.hashTagContent = hashTagContent;
    }
}
