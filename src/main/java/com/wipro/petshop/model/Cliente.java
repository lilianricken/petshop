package com.wipro.petshop.model;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID_cliente;

    @NotBlank(message = "Campo Obrigatório")
    private String nome;
    @NotBlank(message = "Campo Obrigatório")
    private String sobranome;
    @NotBlank(message = "Campo Obrigatório")
    @UniqueElements
    private int cpf;
    @NotBlank(message = "Campo Obrigatório")
    @Email
    private String email;
    @NotBlank(message = "Campo Obrigatório")
    private String endereco;
    @NotBlank(message = "Campo Obrigatório")
    private int telefone;

    @OneToMany(targetEntity = Pet.class)
    private List<Pet> pets = new ArrayList<>();

    public int getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(int ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobranome() {
        return sobranome;
    }

    public void setSobranome(String sobranome) {
        this.sobranome = sobranome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
