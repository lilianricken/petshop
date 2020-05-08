package com.wipro.petshop.entity;

import com.wipro.petshop.entity.util.Status;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Time;
import java.util.Date;
import java.util.Set;

@Entity
public class OrdemServico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotBlank(message = "Campo Obrigatório")
    private Date dia;
    @NotBlank(message = "Campo Obrigatório")
    private Time horaInicial;
    @NotBlank(message = "Campo Obrigatório")
    private Time horaEntrega;
    @NotBlank(message = "Campo Obrigatório")
    private Time horaRetirada;
    @NotBlank(message = "Campo Obrigatório")
    private boolean pagamento;
    @NotBlank(message = "Campo Obrigatório")
    private Status status;
    @NotBlank(message = "Campo Obrigatório")
    private float valor;

    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Funcionario funcionario;
    @ManyToMany
    private Set<Servico> servicos;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public Time getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(Time horaInicial) {
        this.horaInicial = horaInicial;
    }

    public Time getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(Time horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public Time getHoraRetirada() {
        return horaRetirada;
    }

    public void setHoraRetirada(Time horaRetirada) {
        this.horaRetirada = horaRetirada;
    }

    public boolean isPagamento() {
        return pagamento;
    }

    public void setPagamento(boolean pagamento) {
        this.pagamento = pagamento;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
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
