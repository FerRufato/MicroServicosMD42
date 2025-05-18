package com.exemplo.cliente.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Data
@Document(collection = "clientes")
public class Cliente {
    @Id
    private String id;

    @NotBlank
    private String nome;

    @Email
    private String email;
}
