package com.creativeapp.creativeapp.models.piece;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table (name = "piece")
public class Piece {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @Column
    private int weigth;
    @Column
    private int height;

    private int[][] piecePositions = new int[weigth][height];



}
