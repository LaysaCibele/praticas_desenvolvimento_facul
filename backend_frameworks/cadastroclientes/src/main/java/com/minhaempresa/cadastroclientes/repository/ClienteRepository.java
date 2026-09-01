// vai gravar os dados

package com.minhaempresa.cadastroclientes.repository;

import com.minhaempresa.cadastroclientes.model.Cliente;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ClienteRepository {

    private Map<Long, Cliente> clientes = new HashMap<>();
    private Long contadorId = 1L;

    // usado tanto para inserir quanto para atualizar um cliente.
    public Cliente save(Cliente cliente) {
        if (cliente.getId() == null) {
            cliente.setId(contadorId++);
        }
        clientes.put(cliente.getId(), cliente);
        return cliente;
    }
    public Cliente findById(Long id) {   return clientes.get(id);   }
    public void deleteById(Long id) {   clientes.remove(id);    }

    public List<Cliente> findAll() {  
        return new ArrayList<>(clientes.values());
    }
}
