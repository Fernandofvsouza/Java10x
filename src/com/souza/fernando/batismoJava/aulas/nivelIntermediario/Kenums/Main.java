package com.souza.fernando.batismoJava.aulas.nivelIntermediario.Kenums;



public class Main {
    static void main(String[] args) {
        Missoes missao1 = new Missoes("Resgatar o Hokage", RankDeMissoes.S);
        Missoes missao2 = new Missoes("Resgatar cachorro", RankDeMissoes.D);
        missao1.exibirDetalhes();
        missao2.exibirDetalhes();

    }
}
