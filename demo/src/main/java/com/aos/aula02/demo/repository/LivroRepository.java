package com.aos.aula02.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aos.aula02.demo.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro,Long>{

    //Em todos os repositorios de interface JPA
    //save
    //delete
    //deleteById
    //findAll
    //findById
    public Livro findByTitulo (String titulo);
    public Livro findByGenero (String genero);
    public List<Livro> findByPaginas (Integer paginas);
    public void deleteByTitulo (String titulo);
    public void deleteByGenero (String genero);
    public void deleteByPaginas (Integer paginas);


}
