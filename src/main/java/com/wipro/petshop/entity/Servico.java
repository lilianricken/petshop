package com.wipro.petshop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.sql.Time;

@Entity
public class Servico {
    @Id
    @GeneratedValue
    private int Id;

    @NotBlank(message = "Campo Obrigatório")
    private String descricao;
    @NotBlank(message = "Campo Obrigatório")
    private Time duracao;
    @NotBlank(message = "Campo Obrigatório")
    private float valorUnitario;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Time getDuracao() {
        return duracao;
    }

    public void setDuracao(Time duracao) {
        this.duracao = duracao;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

}
