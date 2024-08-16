package com.aos.aula02.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aos.aula02.demo.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro,Long>{

    public Livro findByTitulo (String titulo);
    

}
