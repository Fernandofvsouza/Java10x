package com.souza.fernando.batismoJava.aulas.nivelIntermediario.Gsobrecargadeconstrutores;

public class Ninja {
    //TODO: INCLUIR DOIS NOVOS ATRIBUTOS: numeroDeMissoes, Rank
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;


    public Ninja(){

    }

    public Ninja(String nome, String aldeia, int idade){
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //Overload de construtor depois da criação de numeroDeMissoes e Rank
    //Na sobrecarga de metodos voce nao precisa redeclarar o construtor, apenas os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank){
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }


}
