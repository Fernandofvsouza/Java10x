package com.souza.fernando.batismoJava.exerciciosTreino.SistemaFolhaPagamento;

public class Estagiario extends Funcionario {
    private double bolsaAuxilio;

    public Estagiario(String nome, double salarioBase, double bolsaAuxilio) {
        super(nome, salarioBase);
        this.bolsaAuxilio = bolsaAuxilio;
    }

    @Override
    public double calcularSalario() {
        salarioBase = salarioBase + bolsaAuxilio;
        return salarioBase;
    }

    @Override
    public String getCargo() {
        return "Estagiario";
    }


    public double getBolsaAuxilio() {
        return bolsaAuxilio;
    }

    public void setBolsaAuxilio(double bolsaAuxilio) {
        this.bolsaAuxilio = bolsaAuxilio;
    }
}
