package com.souza.fernando.batismoJava.desafios.d05;

public class ContaPoupanca extends ContaBancaria{
    private TipoConta tipoConta;
    public ContaPoupanca(double saldo) {
        super(saldo);
        this.tipoConta = TipoConta.CONTA_POUPANCA;

    }
    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor - (valor  * 0.01));
        System.out.println("Depósito realizado com sucesso! Novo saldo: " + getSaldo());
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }


}
