package com.souza.fernando.batismoJava.desafios.d05;

public class ContaCorrente extends ContaBancaria {
    private TipoConta tipoConta;
    public ContaCorrente(double saldo) {
        super(saldo);
        this.tipoConta = TipoConta.CONTA_CORRENTE;
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
        System.out.println("Depósito realizado com sucesso! Novo saldo: " + getSaldo());
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }
}
