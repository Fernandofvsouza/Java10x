package com.souza.fernando.batismoJava.aulas.nivelIntermediario.Dconstrutores;

public class Main {
    static void main(String[] args) {
        //Criando um objeto com construtor no args
        Hokage hokage1= new Hokage();
        hokage1.nome = "Hashirama";
        hokage1.idade = 30;
        hokage1.vivoOuNao = true;


        //Criando um objeto com construtor allArgs
        Hokage hokage2 = new Hokage("Tobirama", 25, true);

    }
}
