package com.souza.fernando.batismoJava.aulas.nivelBasico.aulaArray;

public class Array02 {
    static void main(String[] args) {
        //Um indice de um array de string sem conteudo = null
        String[] nomes = new String[3];
        System.out.println("Indice 0: " + nomes[0]); //Null

        //Um indice de um array de int sem conteudo = 0
        int[] idades = new int[3];
        System.out.println("Indice 1: " + idades[0]); //0

        //Um indice de um array de boolean = false
        boolean[] isOpen = new boolean[3];
        System.out.println("Indice 2: " + isOpen[0]);

        
    }
}
