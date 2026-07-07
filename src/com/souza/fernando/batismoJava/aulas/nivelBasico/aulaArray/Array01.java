package com.souza.fernando.batismoJava.aulas.nivelBasico.aulaArray;

public class Array01 {
    static void main(String[] args) {
        //Nao escalavel
        /* String ninja1 = "Naruto Uzumaki";
        String ninja2 = "Sasuke Uchiha";
        String ninja3 = "Sakura Haruno";
        System.out.println(ninja1);
        System.out.println(ninja2);
        System.out.println(ninja3);
        */

        //Escalavel
        String[] ninjas = new String[3];
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Sakura Haruno";
        for (int i = 0; i < ninjas.length; i++) {
            System.out.println(ninjas[i]);
        }


    }
}
