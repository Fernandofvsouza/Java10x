package com.souza.fernando.batismoJava.aulas.nivelIntermediario.FherancaMultipla;

public class Hatake extends Ninja implements ShariganInterface, anbuInterface {
    public void boasVindas(){
        System.out.println(nome + " Eu sou um Hatake");
    }


    public void shariganAtivado(){
        System.out.println("Eu sou um Hatake e estou ativando o sharigan");
    }

    public void ninjaDeElite(){
        System.out.println("Eu sou um Hatake e sou um ninja de elite");
    }

}
