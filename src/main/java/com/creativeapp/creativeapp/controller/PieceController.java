package com.creativeapp.creativeapp.controller;


import com.creativeapp.creativeapp.models.Piece;
import com.creativeapp.creativeapp.service.PieceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/api/v1")
public class PieceController {

    private final PieceDAO repository;

    @Autowired
    public PieceController(PieceDAO repository) {
        this.repository = repository;
    }

    @GetMapping(path = "/pieces")
    public Iterable<Piece> getAllPieces() {
        return repository.getAllPieces();
    }

    @PostMapping(path = "/addPiece")
    public void createPiece(@RequestBody Piece piece) {
        repository.createPiece(piece);
    }

    @PutMapping(path = "{id}")
    public void updatePiece(@PathVariable Long id, @RequestBody Piece piece) {
        repository.updatePiece(id, piece);
    }

    @DeleteMapping(path = "{id}")
    public void deletePiece(@PathVariable Long id){
        repository.deletePiece(id);
    }
}
