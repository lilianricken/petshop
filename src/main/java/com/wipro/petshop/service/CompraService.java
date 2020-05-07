package com.wipro.petshop.service;

import com.wipro.petshop.entity.Compra;
import com.wipro.petshop.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompraService {

    @Autowired
    private CompraRepository compraRepository;

    public Iterable<Compra> findAll() {
        return compraRepository.findAll();
    }

    //create
    public Compra createCompra(Compra compra) {
        return compraRepository.save(compra);
    }

    //read
    public Compra readCompraID(Long id) {
        Optional<Compra> optionalCompra = compraRepository.findById(id);
        return optionalCompra.orElseThrow(() -> new RuntimeException("ID não encontrado"));
    }

    //update
    public void updateCompra(Compra compra) {
        compraRepository.save(compra);
    }

    //delete
    public void deleteCompraID(Long id) {
        compraRepository.deleteById(id);
    }
}
