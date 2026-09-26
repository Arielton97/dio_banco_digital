package org.dio_banco_digital.model.conta;

import org.dio_banco_digital.model.Cliente;

public class ContaCorrente extends Conta {

    public ContaCorrente (Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
