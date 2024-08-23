package com.aos.aula02.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aos.aula02.demo.model.Editora;
import com.aos.aula02.demo.repository.EditoraRepository;

@Service
public class EditoraService {

    @Autowired
    private EditoraRepository editoraRepository;

    // CREATE
    public Editora inserirEditora(Editora editora) {
        return editoraRepository.save(editora);
    }

    // READ

    public List<Editora> buscarTodasEditoras() {
        return editoraRepository.findAll();
    }

    public Optional<Editora> buscarPeloId(Long id) {
        return editoraRepository.findById(id);
    }

    public List<Editora> buscarPeloNome(String nome) {
        return editoraRepository.findByNome(nome);
    }

    public Editora buscarPeloCNPJ(String CNPJ) {
        return editoraRepository.findByCNPJ(CNPJ);
    }

    // DELETE

    public void deletaEditora(Editora editora) {
        editoraRepository.delete(editora);
    }

    public void deletaPeloId(Long id) {
        editoraRepository.deleteById(id);
    }

    public void deletePeloNome(String nome) {
        editoraRepository.deleteByNome(nome);
    }

    public void deletePeloCNPJ(String CNPJ) {
        editoraRepository.deleteByCNPJ(CNPJ);
    }
}
