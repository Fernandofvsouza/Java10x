package com.souza.fernando.batismoJava.exerciciosTreino.NinjasI;

public abstract class Ninja implements EstrategiaDeBatalha {
    private String nome;
    private int idade;
    private String aldeia;

    public void apresentar(){
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e sou da aldeia " + aldeia);
    }

    public abstract void habilidadeEspecial();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }
}
