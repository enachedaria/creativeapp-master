package com.creativeapp.creativeapp.repository;

import com.creativeapp.creativeapp.models.Piece;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PieceRepository extends JpaRepository<Piece, Long> {
}
