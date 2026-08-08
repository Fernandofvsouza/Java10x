package com.souza.fernando.batismoJava.aulas.nivelIntermediario.FherancaMultipla;

public class Main {
    static void main(String[] args) {
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.idade = 18;
        Sasuke.shariganAtivado();


        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.aldeia = "Aldeia da folha";
        kakashi.idade = 48;
        kakashi.boasVindas();
        kakashi.shariganAtivado();
        kakashi.ninjaDeElite();
    }
}
