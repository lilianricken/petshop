package com.wipro.petshop.service;

import com.wipro.petshop.entity.Cliente;
import com.wipro.petshop.entity.Pet;
import com.wipro.petshop.exception.NotFoundException;
import com.wipro.petshop.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PetService {

    private final PetRepository petRepository;
    private final ClienteService clienteService;

    private static final String NAOENCONTRADO = "Animal não encontrado";

    public PetService(PetRepository petRepository, ClienteService clienteService) {
        this.petRepository = petRepository;
        this.clienteService = clienteService;
    }

    public Iterable<Pet> findAll() {
        return petRepository.findAll();
    }

    //create
    public Pet createPet(int clienteId, Pet pet) {
        Cliente cliente = clienteService.readClienteID(clienteId);
        cliente.getPets().add(pet);
        clienteService.updateCliente(clienteId, cliente);
        return petRepository.save(pet);
    }

    //read
    public Pet readPetID(int id) {
        Optional<Pet> optionalPet = petRepository.findById(id);
        return optionalPet.orElseThrow(() -> new NotFoundException(NAOENCONTRADO));
    }

    //update
    public Pet updatePet(int id, Pet pet) {
        Optional<Pet> optionalPet = petRepository.findById(id);
        if (!optionalPet.isPresent()) {
            throw new NotFoundException(NAOENCONTRADO);
        }
        return petRepository.save(pet);
    }

    //delete
    public void deletePetID(int id) {
        Optional<Pet> optionalCliente = petRepository.findById(id);
        if (!optionalCliente.isPresent()) {
            throw new NotFoundException(NAOENCONTRADO);
        }
        petRepository.deleteById(id);
    }
}
