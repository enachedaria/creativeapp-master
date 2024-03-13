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

    public List<Piece> getAllPieces() {
        List<Piece> pieces = new ArrayList<>();
        Iterable<Piece> iterable = pieceRepository.findAll();
        for (Piece piece : iterable) {
            pieces.add(piece);
        }
        return pieces;
    }
}
