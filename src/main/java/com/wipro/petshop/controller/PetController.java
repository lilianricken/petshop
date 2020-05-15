package com.wipro.petshop.controller;

import com.wipro.petshop.entity.Pet;
import com.wipro.petshop.service.PetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/cliente/{idCliente}/pet")
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping
    public ResponseEntity<Iterable<Pet>> findAll() {
        return ResponseEntity.ok(petService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pet> findById(@PathVariable("idCliente") int idCliente, @PathVariable("id") int id) {
        return ResponseEntity.ok(petService.readPetID(id));
    }

    @PostMapping
    public ResponseEntity<Pet> createPet(@PathVariable("idCliente") int idCliente, @RequestBody @Valid Pet pet) {
        return ResponseEntity.status(HttpStatus.CREATED).body(petService.createPet(idCliente, pet));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pet> updatePet(@PathVariable("idCliente") int idCliente, @PathVariable("id") int id, @RequestBody @Valid Pet pet) {
        return ResponseEntity.ok(petService.updatePet(id, pet));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Pet> deletePetID(@PathVariable("idCliente") int idCliente, @PathVariable("id") int id) {
        petService.deletePetID(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
