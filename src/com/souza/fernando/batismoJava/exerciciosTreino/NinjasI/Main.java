package com.souza.fernando.batismoJava.exerciciosTreino.NinjasI;

public class Main {
    static void main(String[] args) {
        Ninja Naruto = new Uzumaki("Naruto Uzumaki", 18, "Folha", "Hadoukken", "Cansar o adversário");
        Naruto.apresentar();
        Naruto.habilidadeEspecial();
        Naruto.estrategiaDeBatalha();

        System.out.println("----------------------------");

        Ninja Sasuke = new Uchiha("Sasuke Uchiha", 20, "Papel", "Hazengan", "Ludibriar o adversário");
        Sasuke.apresentar();
        Sasuke.habilidadeEspecial(); 
        Sasuke.estrategiaDeBatalha();


    }
}
