package com.souza.fernando.batismoJava.aulas.nivelIntermediario.Binterface;

public class Boruto extends Uzumaki implements HyugaUzumaki{
    String cla = "Boruto";

    @Override
    public void AtivarOKarma() {
        System.out.println("Meu nome é: " + nome + " o karma ativou, eu sou um Boruto");
    }

    @Override
    public void ativarJougan() {
        System.out.println("Meu nome é: " + nome + " o jougan ativou, eu sou um Boruto");
    }
}
