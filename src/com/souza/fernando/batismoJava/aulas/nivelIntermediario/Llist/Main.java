package com.souza.fernando.batismoJava.aulas.nivelIntermediario.Llist;


import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        //Diferença entre array e listas: os arrays são estaticos, não alteram de tamanho
        //Array
        String[] ninjasArray = new String[4];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";
        //Quando imprimimos o array, é apontado para o espaço da memoria
        System.out.println("Array de ninjas: " + ninjasArray);

        //Listas
        //Listas nao são estatica, elas podem aumentar e diminuir;
        List<String> ninjasList = new ArrayList<>();
        //Adicionando
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Tobirama Senju");
        //Removendo
        ninjasList.remove("Naruto Uzumaki");

        //Trocando elementos
        ninjasList.set(2, "Kakashi Hatake");

        //Vendo o tamanho da lista
        System.out.println("Tamanho da lista: " + ninjasList.size());

        //como a lista extende o metodo toString, quando imprimimos a lista entao é apontado para o conteudo
        System.out.println("Lista de ninjas: " + ninjasList);



    }
}
