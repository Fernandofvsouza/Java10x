package com.souza.fernando.batismoJava.desafios.d05;

public abstract class ContaBancaria implements Conta {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual: " + this.saldo);
    }

    @Override
    public abstract void depositar(double saldo);



    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
