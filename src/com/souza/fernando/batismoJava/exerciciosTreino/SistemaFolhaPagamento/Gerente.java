package com.souza.fernando.batismoJava.exerciciosTreino.SistemaFolhaPagamento;

public class Gerente extends Funcionario {
    private double bonificacao;

    public Gerente(String nome, double salarioBase, double bonificacao) {
        super(nome, salarioBase);
        this.bonificacao = bonificacao;
    }

    @Override
    public double calcularSalario() {

        return salarioBase +  bonificacao;
    }

  @Override
  public String getCargo() {

      return "Gerente";
  }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }
}
