package com.wipro.petshop.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Servico {
    @Id
    @GeneratedValue
    private int ID_servico;

    @NotBlank(message = "Campo Obrigatório")
    private String descricao;
    @NotBlank(message = "Campo Obrigatório")
    private int duracao; //eu sei que não é, coloquei provisório até descobrir
    @NotBlank(message = "Campo Obrigatório")
    private float val_unit;

    @ManyToMany(targetEntity = OrdemServico.class)
    private List<OrdemServico> ordemServicos = new ArrayList<>();

}
