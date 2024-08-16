package com.aos.aula02.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aos.aula02.demo.model.Autor;


@Repository
public interface AutorRepository extends JpaRepository<Autor,Long>{

    //Em todos os repositorios de interface JPA
    //save
    //delete
    //deleteById
    //findAll
    //findById
    public Autor findByCPF(String CPF);
    public List<Autor> findByIdade (Short idade);
    public void delteByCPF (String CPF);
}
