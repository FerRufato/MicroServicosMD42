package com.exemplo.cliente.service;

import com.exemplo.cliente.model.Cliente;
import com.exemplo.cliente.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }

    public Cliente atualizar(String id, Cliente cliente) {
        cliente.setId(id);
        return repository.save(cliente);
    }

    public List<Cliente> listar() {
        return repository.findAll();
    }

    public Cliente buscarPorId(String id) {
        return repository.findById(id).orElse(null);
    }
}
