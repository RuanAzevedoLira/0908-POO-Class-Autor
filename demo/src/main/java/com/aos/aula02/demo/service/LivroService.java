package com.aos.aula02.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aos.aula02.demo.model.Livro;
import com.aos.aula02.demo.repository.LivroRepository;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    // Salvar ou atualizar um livro
    public Livro inserirLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    // READ

    // Encontrar todos os livros
    public List<Livro> buscarTodosLivros() {
        return livroRepository.findAll();
    }

    // Encontrar um livro por ID
    public Optional<Livro> findById(Long id) {
        return livroRepository.findById(id);
    }

    // Encontrar um livro por titulo
    public Livro buscarPeloTitulo(String titulo) {
        return livroRepository.findByTitulo(titulo);
    }

    // Encontrar um livro por gênero
    public Livro buscarPeloGenero(String genero) {
        return livroRepository.findByGenero(genero);
    }

    // Encontrar livros por número de páginas
    public List<Livro> findByPaginas(Integer paginas) {
        return livroRepository.findByPaginas(paginas);
    }

    // DELETE

    // Deletar um livro por título
    public void deletaPeloTitulo(String titulo) {
        livroRepository.deleteByTitulo(titulo);
    }

    // Deletar um livro por gênero
    public void deletaPeloGenero(String genero) {
        livroRepository.deleteByGenero(genero);
    }

    // Deletar um livro por número de páginas
    public void deletaPeloPaginas(Integer paginas) {
        livroRepository.deleteByPaginas(paginas);
    }

    // Deletar um livro por ID
    public void deletaPeloId(Long id) {
        livroRepository.deleteById(id);
    }
}
