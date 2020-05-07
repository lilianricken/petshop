package com.wipro.petshop.entity;

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

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    private Cliente cliente;

    public Pet() {
    }

    public int getID_pet() {
        return ID_pet;
    }

    public void setID_pet(int ID_pet) {
        this.ID_pet = ID_pet;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
