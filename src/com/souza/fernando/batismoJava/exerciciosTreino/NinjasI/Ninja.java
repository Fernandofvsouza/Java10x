package com.souza.fernando.batismoJava.exerciciosTreino.NinjasI;

public abstract class Ninja implements EstrategiaDeBatalha {
    private String nome;
    private int idade;
    private String aldeia;
    private String habilidadeEspecial;
    private String estrategiaDeBatalha;

    public Ninja(String nome, int idade, String aldeia, String habilidadeEspecial, String estrategiaDeBatalha) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.habilidadeEspecial = habilidadeEspecial;
        this.estrategiaDeBatalha = estrategiaDeBatalha;
    }

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

    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    public void setHabilidadeEspecial(String habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public String getEstrategiaDeBatalha() {
        return estrategiaDeBatalha;
    }

    public void setEstrategiaDeBatalha(String estrategiaDeBatalha) {
        this.estrategiaDeBatalha = estrategiaDeBatalha;
    }
}
