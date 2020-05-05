package com.wipro.petshop.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class OrdemServico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_ordem;
    @NotBlank(message = "Campo Obrigatório")
    private Date dia;
    @NotBlank(message = "Campo Obrigatório")
    private Time hora_init;
    @NotBlank(message = "Campo Obrigatório")
    private Time hora_entr;
    @NotBlank(message = "Campo Obrigatório")
    private Time hora_ret;
    @NotBlank(message = "Campo Obrigatório")
    private boolean pagamento;
    @NotBlank(message = "Campo Obrigatório")
    private String statusServico;
    @NotBlank(message = "Campo Obrigatório")
    private float valor;

    @ManyToOne
    private Compra compra;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Funcionario funcionario;
    @ManyToMany(targetEntity = Servico.class)
    private List<Servico> servicos = new ArrayList<>();



}
