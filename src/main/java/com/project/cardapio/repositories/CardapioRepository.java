package com.project.cardapio.repositories;

import com.project.cardapio.models.CardapioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardapioRepository extends JpaRepository<CardapioModel, Integer> {
}
