package com.wipro.petshop.controller;

import com.wipro.petshop.entity.Cliente;
import com.wipro.petshop.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public ResponseEntity<Iterable<Cliente>> findAll() {
        return ResponseEntity.ok(clienteService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable("id") int id) {
        return ResponseEntity.ok(clienteService.readClienteID(id));
    }

    @PostMapping
    public ResponseEntity<Cliente> createCliente(@RequestBody @Valid Cliente cliente) {
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.createCliente(cliente));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable("id") int id, @RequestBody @Valid Cliente cliente) {
        return ResponseEntity.ok(clienteService.updateCliente(id, cliente));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Cliente> deleteClienteID(@PathVariable("id") int id) {
        clienteService.deleteClienteID(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
