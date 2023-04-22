package com.project.cardapio.controllers;

import com.project.cardapio.dtos.CardapioDto;
import com.project.cardapio.models.CardapioModel;
import com.project.cardapio.repositories.CardapioRepository;
import com.project.cardapio.services.CardapioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.modelmapper.ModelMapper;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("cardapio")
public class CardapioController {

    @Autowired
    private CardapioRepository repository;

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private CardapioService service;
    @GetMapping
    public ResponseEntity<List<CardapioDto>> findAll() {

        List<CardapioModel> listOfAll = repository.findAll();

        List<CardapioDto> listDTO = listOfAll.stream().map(x -> mapper.map(x, CardapioDto.class)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);

    }

    @PostMapping
    public void save(@RequestBody CardapioDto obj) {
        service.create(obj);
        return;
    }
}
