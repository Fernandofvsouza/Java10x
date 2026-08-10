package com.souza.fernando.batismoJava.aulas.nivelIntermediario.Gsobrecargadeconstrutores;

public class Uchiha extends Ninja{
    public Uchiha(){
        super();
    }
    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

}
