package com.aos.aula02.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aos.aula02.demo.model.Editora;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, Long>{

    //Em todos os repositorios de interface JPA
    //save
    //delete
    //deleteById
    //findAll
    //findById
    public Editora findByCNPJ (String CNPJ);
    public List<Editora> findByNome (String nome);
    public void deleteByCNPJ (String CNPJ);
    public void deleteByNome (String nome);
    
}
