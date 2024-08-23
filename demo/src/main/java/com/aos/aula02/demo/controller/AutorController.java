package com.aos.aula02.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aos.aula02.demo.model.Autor;
import com.aos.aula02.demo.service.AutorService;

@RequestMapping("/api/v1/autores")
@RestController
public class AutorController {

    @Autowired
    private AutorService autorService;

    @PostMapping
    public Autor inserirAutor(@RequestBody Autor autor) {
        return autorService.inserirAutor(autor);
    }

    @GetMapping
    public List<Autor> getTodosAutores() {
        return autorService.buscarTodosAutores();
    }

    @GetMapping("/cpf/{CPF}") // Corrected the endpoint and added @PathVariable
    public Autor buscarAutorPeloCPF(@PathVariable String CPF) {
        return autorService.buscarPeloCPF(CPF);
    }

    @GetMapping("/{id}") // Added endpoint for fetching by ID
    public Optional<Autor> buscarAutorPeloId(@PathVariable Long id) {
        return autorService.buscarPeloId(id);
    }
}
