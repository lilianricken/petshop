package com.wipro.petshop.service;

import com.wipro.petshop.entity.Funcionario;
import com.wipro.petshop.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Iterable<Funcionario> findAll() {
        return funcionarioRepository.findAll();
    }

    //create
    public Funcionario createFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    //read
    public Funcionario readFuncionarioID(int id) {
        Optional<Funcionario> optionalFuncionario = funcionarioRepository.findById(id);
        return optionalFuncionario.orElseThrow(() -> new RuntimeException("ID não encontrado"));
    }

    //update
    public void updateFuncionario(Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
    }

    //delete
    public void deleteFuncionarioID(int id) {
        funcionarioRepository.deleteById(id);
    }
}
