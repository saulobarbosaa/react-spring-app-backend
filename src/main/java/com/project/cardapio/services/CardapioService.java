package com.project.cardapio.services;

import com.project.cardapio.dtos.CardapioDto;
import com.project.cardapio.models.CardapioModel;
import com.project.cardapio.repositories.CardapioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardapioService {

    @Autowired
    private CardapioRepository repository;

    @Autowired
    private ModelMapper mapper;

    public CardapioModel create(CardapioDto obj) {
        return repository.save(mapper.map(obj, CardapioModel.class));
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
