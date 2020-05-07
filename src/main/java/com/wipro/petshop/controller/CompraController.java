package com.wipro.petshop.controller;

import com.wipro.petshop.entity.Compra;
import com.wipro.petshop.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @GetMapping
    public Iterable<Compra> findAll() {
        return compraService.findAll();
    }

    @GetMapping("/{id}")
    public Compra findById(@PathVariable Long id) {
        return compraService.readCompraID(id);
    }

    @PostMapping
    public Compra createCompra(@RequestBody Compra compra) {
        return compraService.createCompra(compra);
    }

    @PutMapping
    public void updateCompra(@RequestBody Compra compra) {
        compraService.updateCompra(compra);
    }

    @DeleteMapping("/{id}")
    public void deleteCompraId(@PathVariable Long id) {
        compraService.deleteCompraID(id);
    }
}
