package com.creativeapp.creativeapp.models.piece;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping(path = "/test")
    public String test(){
        return "TEST";
    }

}
