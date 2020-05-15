package com.wipro.petshop.service;

import com.wipro.petshop.entity.Cliente;
import com.wipro.petshop.exception.NotFoundException;
import com.wipro.petshop.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    private static final String NAOENCONTRADO = "Cliente não encontrado";

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Iterable<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    //create
    public Cliente createCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    //read
    public Cliente readClienteID(int id) {
        Optional<Cliente> optionalCliente = clienteRepository.findById(id);
        return optionalCliente.orElseThrow(() -> new NotFoundException(NAOENCONTRADO));
    }

    //update
    public Cliente updateCliente(int id, Cliente cliente) {
        Optional<Cliente> optionalCliente = clienteRepository.findById(id);
        if (!optionalCliente.isPresent()) {
            throw new NotFoundException(NAOENCONTRADO);
        }
        return clienteRepository.save(cliente);
    }

    //delete
    public void deleteClienteID(int id) {
        Optional<Cliente> optionalCliente = clienteRepository.findById(id);
        if (!optionalCliente.isPresent()) {
            throw new NotFoundException(NAOENCONTRADO);
        }
        clienteRepository.deleteById(id);
    }
}
