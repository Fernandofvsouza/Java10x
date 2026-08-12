package com.souza.fernando.batismoJava.aulas.nivelIntermediario.HtoString;

public class Ninja {
    String nome;
    String aldeia;
    int idade;
     public Ninja(String nome, String aldeia, int idade) {
         this.nome = nome;
         this.aldeia = aldeia;
         this.idade = idade;
     }


    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", aldeia='" + aldeia + '\'' +
                ", idade=" + idade +
                '}';
    }
}
