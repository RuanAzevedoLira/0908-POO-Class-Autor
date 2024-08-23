package com.aos.aula02.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aos.aula02.demo.model.Livro;
import com.aos.aula02.demo.service.LivroService;

@RestController
@RequestMapping("api/v1/livros") // Melhor para seguir a convenção plural
public class LivroController {

    @Autowired
    private LivroService livroService;

    // Criar ou atualizar um livro
    @PostMapping("/save")
    public Livro inserirLivro(@RequestBody Livro livro) {
        return livroService.inserirLivro(livro);
    }

    // Ler todos os livros
    @GetMapping
    public List<Livro> pegarLivros() {
        return livroService.buscarTodosLivros();
    }

    // Atualizar um livro pelo ID
    @PutMapping("id/{id}")
    public Livro alteraInfosPeloId(@PathVariable Long id, @RequestBody Livro livroAtualizado) {
        return livroService.atualizarLivro(id, livroAtualizado);
    }

    // Deletar um livro por gênero
    @DeleteMapping("/genero/{genero}")
    public void deletaPeloGenero(@PathVariable String genero) {
        livroService.deletaPeloGenero(genero);
    }
    
    // Deletar um livro pelo ID
    @DeleteMapping("/{id}")
    public void deletePeloId(@PathVariable Long id) {
        livroService.deletaPeloId(id);
    }
}
