package com.aos.aula02.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
public class Livro {
    
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String titulo;

    @NonNull
    private String genero;

    @NonNull
    private Integer paginas;
}
