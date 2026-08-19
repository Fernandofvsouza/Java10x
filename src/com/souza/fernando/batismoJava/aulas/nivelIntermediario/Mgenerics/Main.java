package com.souza.fernando.batismoJava.aulas.nivelIntermediario.Mgenerics;

public class Main {
    static void main(String[] args) {
        //Criando instancia de cada tipo de item
        Kunai kunai = new Kunai("Kunai de fogo");
        Shuriken shuriken = new Shuriken(10);
        Pergaminho pergaminho = new Pergaminho("Invocação do sapo");

        //Criando a bolsa de items
        BolsaNinja<ItemNinja> bolsaNinja = new BolsaNinja<>();
        //Adicionando itens a bolsa ninja
        bolsaNinja.adicionaItem(kunai);
        bolsaNinja.adicionaItem(shuriken);
        bolsaNinja.adicionaItem(pergaminho);

        //Exibindo os itens:
        System.out.println(bolsaNinja);

    }
}
