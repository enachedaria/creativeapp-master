package com.creativeapp.creativeapp.models.piece;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/api")
@RestController
public class PieceController {

    private final PieceDAO repository;

    @Autowired
    public PieceController(PieceDAO repository){
        this.repository = repository;
    }

    @GetMapping(path = "/pieces")
    public Iterable<Piece> getAllPieces(){
        return repository.getAllPieces();
    }

   @PostMapping
    public void createPiece(@RequestBody Piece piece){
        repository.createPiece(piece);
   }

}
