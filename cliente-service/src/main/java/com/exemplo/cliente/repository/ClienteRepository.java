package com.exemplo.cliente.repository;

import com.exemplo.cliente.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
}
