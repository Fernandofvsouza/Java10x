package com.souza.fernando.batismoJava.aulas.nivelIntermediario.Nrecords;

public class Main {
    static void main(String[] args) {
        //Forma tradicional utilizando class
        Ninja ninja = new Ninja("Naruto", "naruto@email.com", 777777);
        System.out.println("Ninja: " + ninja);

        //Utilizando os records
        NinjaRecord ninjaComRecord = new NinjaRecord("Sasuke", "Sasuke@email.com", 8888888);
        System.out.println("Ninja: " + ninjaComRecord);
    }

}
