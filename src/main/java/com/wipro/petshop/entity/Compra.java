package com.wipro.petshop.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_compra;

    @NotBlank(message = "Campo Obrigatório")
    private float val_total;

    @OneToMany(mappedBy = "compra", cascade = CascadeType.ALL)
    private Set<OrdemServico> ordemServicos;

    public Compra() {
    }

    public long getId_compra() {
        return id_compra;
    }

    public void setId_compra(long id_compra) {
        this.id_compra = id_compra;
    }

    public float getVal_total() {
        return val_total;
    }

    public void setVal_total(float val_total) {
        this.val_total = val_total;
    }

    public Set<OrdemServico> getOrdemServicos() {
        return ordemServicos;
    }

    public void setOrdemServicos(Set<OrdemServico> ordemServicos) {
        this.ordemServicos = ordemServicos;
    }
}
