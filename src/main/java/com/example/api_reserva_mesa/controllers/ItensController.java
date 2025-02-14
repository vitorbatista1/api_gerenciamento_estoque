package com.example.api_reserva_mesa.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_reserva_mesa.entity.ItensEntity;
import com.example.api_reserva_mesa.repository.ItensRepository;

@RestController
@RequestMapping("/api/itens")
public class ItensController {

    private final ItensRepository itensRepository;

    public ItensController(ItensRepository itensRepository) {
        this.itensRepository = itensRepository;
    }


    // Buscar todos os itens da tabela
    @RequestMapping
    public Iterable<ItensEntity> listarItens() {
        return itensRepository.findAll();
    }

    @PostMapping
    public ItensEntity criarItem(@RequestBody ItensEntity item) {
        return itensRepository.save(item);
    }   

    
}
