package com.souza.fernando.batismoJava.desafios.d05;

public class Main {
    static void main(String[] args) {
        ContaBancaria contaCorrente = new ContaCorrente(1000.0);
        contaCorrente.consultarSaldo();
        contaCorrente.depositar(500.0);
        contaCorrente.consultarSaldo();

        ContaBancaria contaPoupanca = new ContaPoupanca(2000.0);
        contaPoupanca.consultarSaldo();
        contaPoupanca.depositar(300.0);
        contaPoupanca.consultarSaldo();
    }
}
