package com.wipro.petshop.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Time;
import java.util.Date;
import java.util.Set;

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
    @ManyToMany
    private Set<Servico> servicos;

    public OrdemServico() {
    }

    public long getId_ordem() {
        return id_ordem;
    }

    public void setId_ordem(long id_ordem) {
        this.id_ordem = id_ordem;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public Time getHora_init() {
        return hora_init;
    }

    public void setHora_init(Time hora_init) {
        this.hora_init = hora_init;
    }

    public Time getHora_entr() {
        return hora_entr;
    }

    public void setHora_entr(Time hora_entr) {
        this.hora_entr = hora_entr;
    }

    public Time getHora_ret() {
        return hora_ret;
    }

    public void setHora_ret(Time hora_ret) {
        this.hora_ret = hora_ret;
    }

    public boolean isPagamento() {
        return pagamento;
    }

    public void setPagamento(boolean pagamento) {
        this.pagamento = pagamento;
    }

    public String getStatusServico() {
        return statusServico;
    }

    public void setStatusServico(String statusServico) {
        this.statusServico = statusServico;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Set<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(Set<Servico> servicos) {
        this.servicos = servicos;
    }
}
