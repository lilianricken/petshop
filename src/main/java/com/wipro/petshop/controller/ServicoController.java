package com.wipro.petshop.controller;

import com.wipro.petshop.entity.Servico;
import com.wipro.petshop.service.ServicoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/servico")
public class ServicoController {

    private final ServicoService servicoService;

    public ServicoController(ServicoService servicoService) {
        this.servicoService = servicoService;
    }

    @GetMapping
    public ResponseEntity<Iterable<Servico>> findAll() {
        return ResponseEntity.ok(servicoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Servico> findById(@PathVariable("id") int id) {
        return ResponseEntity.ok(servicoService.readServicoID(id));
    }

    @PostMapping
    public ResponseEntity<Servico> createServico(@RequestBody @Valid Servico servico) {
        return ResponseEntity.status(HttpStatus.CREATED).body(servicoService.createServico(servico));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Servico> updateServico(@PathVariable("id") int id, @RequestBody @Valid Servico servico) {
        return ResponseEntity.ok(servicoService.updateServico(id, servico));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Servico> deleteServicoId(@PathVariable("id") int id) {
        servicoService.deleteServicoID(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
