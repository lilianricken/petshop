package com.wipro.petshop.service;

import com.wipro.petshop.entity.Funcionario;
import com.wipro.petshop.exception.NotFoundException;
import com.wipro.petshop.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

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
        return optionalFuncionario.orElseThrow(() -> new NotFoundException("ID não encontrado"));
    }

    //update
    public Funcionario updateFuncionario(int id, Funcionario funcionario) {
        Optional<Funcionario> optionalFuncionario = funcionarioRepository.findById(id);
        if (!optionalFuncionario.isPresent()) {
            throw new NotFoundException("ID não encontrado");
        }
        return funcionarioRepository.save(funcionario);
    }

    //delete
    public void deleteFuncionarioID(int id) {
        Optional<Funcionario> optionalFuncionario = funcionarioRepository.findById(id);
        if (!optionalFuncionario.isPresent()) {
            throw new NotFoundException("ID não encontrado");
        }
        funcionarioRepository.deleteById(id);
    }

}