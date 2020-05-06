package com.wipro.petshop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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

    public Servico() {
    }

    public int getID_servico() {
        return ID_servico;
    }

    public void setID_servico(int ID_servico) {
        this.ID_servico = ID_servico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public float getVal_unit() {
        return val_unit;
    }

    public void setVal_unit(float val_unit) {
        this.val_unit = val_unit;
    }

    public List<OrdemServico> getOrdemServicos() {
        return ordemServicos;
    }

    public void setOrdemServicos(List<OrdemServico> ordemServicos) {
        this.ordemServicos = ordemServicos;
    }
}
