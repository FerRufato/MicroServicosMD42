package com.exemplo.produto.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;

@Data
@Document(collection = "produtos")
public class Produto {
    @Id
    private String id;

    @NotBlank
    private String nome;

    private double preco;
}
