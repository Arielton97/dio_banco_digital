package org.dio_banco_digital.model;

import org.dio_banco_digital.model.conta.Conta;

public class Banco {
    private String nome;
    private Cliente cliente;
    private Conta conta;

    public Banco(String nome, Cliente cliente, Conta conta) {
        this.nome = nome;
        this.cliente = cliente;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", cliente=" + cliente +
                ", conta=" + conta +
                '}';
    }
}
