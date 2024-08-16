package com.aos.aula02.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aos.aula02.demo.model.Autor;
import com.aos.aula02.demo.repository.AutorRepository;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public void inserirAutor (Autor autor){
        autorRepository.save(autor);
    }

    public List<Autor> retonaTodosAutores(){
        return autorRepository.findAll();
    }

    public Autor buscarPeloCPF (String CPF){
        return autorRepository.findByCPF(CPF);
    }

    public List<Autor> buscarPelaIdade (Short idade){
        return autorRepository.findByIdade(idade);
    }

}
