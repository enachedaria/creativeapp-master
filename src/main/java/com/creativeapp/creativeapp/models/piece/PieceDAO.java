package com.creativeapp.creativeapp.models.piece;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PieceDAO {

    @Autowired
    private PieceRepository pieceRepository;

    public List<Piece> getAllPieces(){
        List<Piece> pieces = new ArrayList<>();
        Streamable.of(pieceRepository.findAll()).forEach(pieces :: add);

        return pieces;
    }

    public void createPiece(Piece piece){
        pieceRepository.save(piece);
    }

}
