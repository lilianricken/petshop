package com.wipro.petshop.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Campo Obrigatório")
    private float valorTotal;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<OrdemServico> ordemServicos;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Set<OrdemServico> getOrdemServicos() {
        return ordemServicos;
    }

    public void setOrdemServicos(Set<OrdemServico> ordemServicos) {
        this.ordemServicos = ordemServicos;
    }
}
