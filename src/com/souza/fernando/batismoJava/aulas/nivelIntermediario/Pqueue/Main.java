package com.souza.fernando.batismoJava.aulas.nivelIntermediario.Pqueue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    static void main(String[] args) {
        //Principais implementações de queues
        Queue<String> ninjasNaruto = new LinkedList<>();
        ninjasNaruto.offer("Naruto");
        ninjasNaruto.offer("Sasuke");
        ninjasNaruto.offer("Sakura");
        System.out.println("Fila de ninjas: " + ninjasNaruto);
        System.out.println("Removendo o primeiro elemento da fila: " + ninjasNaruto.poll());
        System.out.println("Fila de ninjas: " + ninjasNaruto);

        System.out.println("--------------------------------");
        //Implementando ArrayDeque (Mais performatica)
        Queue<String> ninjasNaruto2 = new ArrayDeque<>();
        ninjasNaruto2.offer("Naruto");
        ninjasNaruto2.offer("Sasuke");
        ninjasNaruto2.offer("Sakura");
        System.out.println("Fila de ninjas: " + ninjasNaruto2);
        System.out.println("Removendo o primeiro elemento da fila: " + ninjasNaruto2.poll());
        System.out.println("Fila de ninjas: " + ninjasNaruto2);

        System.out.println("--------------------------------");
        //Implementando priorityQueue (Saem em ordem de prioridade, por exemplo fila de string, a ordem vai ser alfabetica)
        Queue<String> frutas = new PriorityQueue<>();
        frutas.offer("Banana");
        frutas.offer("Romã");
        frutas.offer("Abacaxi");
        System.out.println("Fila de frutas: " + frutas);
        frutas.poll(); //Sai o primeiro elemento da fila, que é o de maior prioridade (no caso a ordem alfabetica) Abacaxi
        System.out.println("Fila de frutas: " + frutas);

    }
}
