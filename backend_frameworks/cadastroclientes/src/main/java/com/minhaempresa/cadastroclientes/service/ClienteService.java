//Essa classe vai conter as regras de negócio
package com.minhaempresa.cadastroclientes.service;

import com.minhaempresa.cadastroclientes.model.Cliente;
import com.minhaempresa.cadastroclientes.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public void salvar(Cliente cliente) {
        repository.save(cliente);
    }

    public Cliente buscarPorId(Long id) {
        return repository.findById(id);
    }

    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    public void remover(Long id) {
        repository.deleteById(id);
    }   
}
