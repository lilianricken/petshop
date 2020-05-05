package com.wipro.petshop.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_compra;

    @NotBlank(message = "Campo Obrigatório")
    private float val_total;

    @OneToMany(targetEntity = OrdemServico.class)
    private List<OrdemServico> ordemServicos = new ArrayList<>();
}
