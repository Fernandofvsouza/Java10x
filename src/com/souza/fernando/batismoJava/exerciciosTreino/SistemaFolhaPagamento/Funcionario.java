package com.souza.fernando.batismoJava.exerciciosTreino.SistemaFolhaPagamento;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract String getCargo();


    public abstract double calcularSalario();

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " +  getCargo());
        System.out.println("Salário Base: " + salarioBase);
        System.out.println("Salário Final: " + calcularSalario());
    }

}
