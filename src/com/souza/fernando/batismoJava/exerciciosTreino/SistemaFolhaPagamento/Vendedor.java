package com.souza.fernando.batismoJava.exerciciosTreino.SistemaFolhaPagamento;

public class Vendedor extends Funcionario{
    private double totalVendas;
    private double comissao;

    public Vendedor(String nome, double salarioBase, double totalVendas, double comissao) {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (totalVendas * comissao);
    }

    @Override
    public String getCargo() {
        return "Vendedor";
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}

