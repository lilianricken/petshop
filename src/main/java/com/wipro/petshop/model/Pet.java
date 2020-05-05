package com.wipro.petshop.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID_pet;

    @NotBlank(message = "Campo Obrigatório")
    private String nome;
    @NotBlank(message = "Campo Obrigatório")
    private int idade;
    @NotBlank(message = "Campo Obrigatório")
    private String raca;
    @NotBlank(message = "Campo Obrigatório")
    private String porte;
    @NotBlank(message = "Campo Obrigatório")
    private String pelagem;

    @ManyToOne
    private Cliente cliente;
}
