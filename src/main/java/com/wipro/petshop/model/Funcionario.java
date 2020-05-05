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
}
