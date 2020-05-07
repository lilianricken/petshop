package com.wipro.petshop.controller;

import com.wipro.petshop.entity.Funcionario;
import com.wipro.petshop.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/compra")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping
    public Iterable<Funcionario> findAll() {
        return funcionarioService.findAll();
    }

    @GetMapping("/{id}")
    public Funcionario findById(@PathVariable int id) {
        return funcionarioService.readFuncionarioID(id);
    }

    @PostMapping
    public Funcionario createFuncionario(@RequestBody Funcionario funcionario) {
        return funcionarioService.createFuncionario(funcionario);
    }

    @PutMapping
    public void updateFuncionario(@RequestBody Funcionario funcionario) {
        funcionarioService.updateFuncionario(funcionario);
    }

    @DeleteMapping("/{id}")
    public void deleteFuncionarioId(@PathVariable int id) {
        funcionarioService.deleteFuncionarioID(id);
    }
}
