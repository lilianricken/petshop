package com.wipro.petshop.entity;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank(message = "Campo Obrigatório")
    private String nome;
    @NotBlank(message = "Campo Obrigatório")
    private String sobrenome;
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

    @OneToMany(cascade = CascadeType.ALL)
    @NotBlank(message = "Campo Obrigatório")
    private Set<Pet> pets;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
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

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
