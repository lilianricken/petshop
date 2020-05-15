package com.wipro.petshop.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull(message = "Campo Obrigatório")
    private String nome;
    @NotNull(message = "Campo Obrigatório")
    private String sobrenome;
    @Column(length = 11, unique = true)
    @NotNull(message = "Campo Obrigatório")
    private String cpf;
    @NotNull(message = "Campo Obrigatório")
    @Email
    private String email;
    @NotNull(message = "Campo Obrigatório")
    private String endereco;
    @Column(length = 11)
    @NotNull(message = "Campo Obrigatório")
    private String telefone;

    @OneToMany(cascade = CascadeType.ALL)
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
