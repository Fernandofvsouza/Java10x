package com.souza.fernando.batismoJava.exerciciosTreino.SobrecarregandoConstrutores;

public class Main {
    static void main(String[] args) {
        Animal cachorro = new Cachorro("Olivia", 5, "Yorkshire", 10.5, "Petisco de carne", 2, "1 vez por dia");
        cachorro.dormir();
        cachorro.fazerBarulho();

        Animal gato = new Gato("Maju", 7, "Europeus comuns", 5.4, "Patê de salmão", 2, "Pelo curto");
        gato.dormir();
        gato.fazerBarulho();

    }
}
