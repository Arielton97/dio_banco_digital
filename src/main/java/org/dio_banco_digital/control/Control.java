package org.dio_banco_digital.control;

import org.dio_banco_digital.model.Cliente;
import org.dio_banco_digital.model.conta.Conta;
import org.dio_banco_digital.model.conta.ContaCorrente;
import org.dio_banco_digital.model.conta.ContaPoupanca;

public class Control {
//    criar clientes
//    criar contas
//    criar banco

    public static void criarClientes() {
        Cliente c1 = new Cliente("Arielton");
        Conta cc = new ContaCorrente(c1);
        Conta cp = new ContaPoupanca(c1);

        System.out.println(cp.getSaldo());

        cc.depositar(100);
        System.out.println(cc.getSaldo());

        System.out.println(cp.getSaldo());

        cc.transferir(70, cp);
        System.out.println(cp.getSaldo());

        cc.imprimirExtrato();
    }
}
