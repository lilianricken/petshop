package com.wipro.petshop.model;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID_funcionario;
    @NotBlank(message = "Campo Obrigatório")
    private String nome_func;
    @NotBlank(message = "Campo Obrigatório")
    private String sobrenome_func;
    @NotBlank(message = "Campo Obrigatório")
    @UniqueElements
    private String login;
    @NotBlank(message = "Campo Obrigatório")
    private String senha;

    @OneToMany(targetEntity = OrdemServico.class)
    private List<OrdemServico> ordemServicos = new ArrayList<>();

    public Funcionario() {
    }

    public int getID_funcionario() {
        return ID_funcionario;
    }

    public void setID_funcionario(int ID_funcionario) {
        this.ID_funcionario = ID_funcionario;
    }

    public String getNome_func() {
        return nome_func;
    }

    public void setNome_func(String nome_func) {
        this.nome_func = nome_func;
    }

    public String getSobrenome_func() {
        return sobrenome_func;
    }

    public void setSobrenome_func(String sobrenome_func) {
        this.sobrenome_func = sobrenome_func;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<OrdemServico> getOrdemServicos() {
        return ordemServicos;
    }

    public void setOrdemServicos(List<OrdemServico> ordemServicos) {
        this.ordemServicos = ordemServicos;
    }
}
