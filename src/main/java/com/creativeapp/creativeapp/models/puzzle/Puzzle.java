package com.creativeapp.creativeapp.models.puzzle;

import com.creativeapp.creativeapp.models.piece.Piece;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name= "puzzle")
public class Puzzle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column
    private DificultyLevels dificultyLevels;

    //@Column
   // private List<Piece> pieces;



}
