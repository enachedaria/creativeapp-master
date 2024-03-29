package com.creativeapp.creativeapp.service;

import com.creativeapp.creativeapp.models.Piece;
import com.creativeapp.creativeapp.repository.PieceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PieceDAO {

    @Autowired
    private PieceRepository pieceRepository;

    public Iterable<Piece> getAllPieces(){
        return pieceRepository.findAll();
    }

    public void createPiece(Piece piece){
        pieceRepository.save(piece);
    }

    public void updatePiece(Long id, Piece piece){
        Piece p = pieceRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Piece with this id doesn't exist!"));
        p.setWeigth(piece.getWeigth());
        p.setHeight(piece.getHeight());
        pieceRepository.save(p);
    }

    public void deletePiece(Long id){
        boolean isExisting = pieceRepository.existsById(id);
        if(!isExisting){
            throw  new IllegalStateException("Piece with this id doesn't exist!");
        }
        pieceRepository.deleteById(id);
    }

}
