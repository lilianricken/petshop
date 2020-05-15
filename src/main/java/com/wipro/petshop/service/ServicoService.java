package com.wipro.petshop.service;

import com.wipro.petshop.entity.Servico;
import com.wipro.petshop.exception.NotFoundException;
import com.wipro.petshop.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServicoService {
    @Autowired
    private ServicoRepository servicoRepository;

    private static final String NAOENCONTRADO = "Serviço não encontrado";

    public Iterable<Servico> findAll() {
        return servicoRepository.findAll();
    }

    //create
    public Servico createServico(Servico servico) {
        return servicoRepository.save(servico);
    }

    //read
    public Servico readServicoID(int id) {
        Optional<Servico> optionalServico = servicoRepository.findById(id);
        return optionalServico.orElseThrow(() -> new NotFoundException(NAOENCONTRADO));
    }

    //update
    public Servico updateServico(int id, Servico servico) {
        Optional<Servico> optionalServico = servicoRepository.findById(id);
        if (!optionalServico.isPresent()) {
            throw new NotFoundException(NAOENCONTRADO);
        }
        return servicoRepository.save(servico);
    }

    //delete
    public void deleteServicoID(int id) {
        Optional<Servico> optionalServico = servicoRepository.findById(id);
        if (!optionalServico.isPresent()) {
            throw new NotFoundException(NAOENCONTRADO);
        }
        servicoRepository.deleteById(id);
    }
}
