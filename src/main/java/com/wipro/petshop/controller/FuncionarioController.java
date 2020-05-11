package com.wipro.petshop.controller;

import com.wipro.petshop.entity.Funcionario;
import com.wipro.petshop.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping
    public ResponseEntity<Iterable<Funcionario>> findAll() {
        return ResponseEntity.ok(funcionarioService.findAll());
    }

    @GetMapping("/funcionario/{id}")
    public ResponseEntity<Funcionario> findById(@PathVariable("id") int id) {
        return ResponseEntity.ok(funcionarioService.readFuncionarioID(id));
    }

    @PostMapping
    public ResponseEntity<Funcionario> createFuncionario(@RequestBody @Valid Funcionario funcionario) {
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionarioService.createFuncionario(funcionario));
    }

    @PutMapping("/funcionario/{id}")
    public ResponseEntity<Funcionario> updateFuncionario(@RequestBody @Valid Funcionario funcionario, @PathVariable("id") int id) {
        return ResponseEntity.ok(funcionarioService.updateFuncionario(id, funcionario));
    }

    @DeleteMapping("/funcionario/{id}")
    public ResponseEntity<Funcionario> deleteFuncionarioId(@PathVariable("id") int id) {
        funcionarioService.deleteFuncionarioID(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
