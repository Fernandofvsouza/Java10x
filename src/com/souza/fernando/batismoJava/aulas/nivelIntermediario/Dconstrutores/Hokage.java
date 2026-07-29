package com.souza.fernando.batismoJava.aulas.nivelIntermediario.Dconstrutores;

public class Hokage {
    String nome;
    int idade;
    boolean vivoOuNao;

    //Construtor noArgs, que o java ja cria automaticamente
    public Hokage(){

    }

    //Construtor allArgs:
    public Hokage(String nome, int idade, boolean vivoOuNao){
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }
}
