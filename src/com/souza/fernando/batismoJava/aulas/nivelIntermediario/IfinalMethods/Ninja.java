package com.souza.fernando.batismoJava.aulas.nivelIntermediario.IfinalMethods;

public class Ninja {
    String nome;
    String aldeia;
    int idade;
    final double altura = 1.80; //Nao pode ser alterada, pois é final

     public Ninja(String nome, String aldeia, int idade) {
         this.nome = nome;
         this.aldeia = aldeia;
         this.idade = idade;
     }

     //Todo ninja vai fazer obrigatoriamente
    //Colocamos como final porque nao queremos que seja sobrescrita
    public final void tacarKunai(){
        System.out.println("Eu sou um metodo da classe mae");
    }


    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", aldeia='" + aldeia + '\'' +
                ", idade=" + idade + ", altura=" + altura +
                '}';
    }
}
