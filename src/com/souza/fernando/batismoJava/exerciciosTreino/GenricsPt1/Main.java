package com.souza.fernando.batismoJava.exerciciosTreino.GenricsPt1;

public class Main {
    static void main(String[] args) {
        //Criando os itens
        Pocao pocao = new Pocao(50);
        Mapa mapa = new Mapa("Mapa do tesouro");
        Espada espada = new Espada(25);

        //Criando o bau
        Bau<ItemAventura> bau = new Bau<>();
        bau.adicionarItem(pocao);
        bau.adicionarItem(mapa);
        bau.adicionarItem(espada);

        System.out.println(bau.toString());
    }
}
