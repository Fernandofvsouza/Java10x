package com.souza.fernando.batismoJava.aulas.nivelIntermediario.Ostack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Main {
    static void main(String[] args) {
        //utilizando stack
        Stack<String> ninjasComStack = new Stack();
        ninjasComStack.push("Naruto");
        ninjasComStack.push("Sasuke");
        ninjasComStack.push("Hinata");
        ninjasComStack.push("Sakura");
        //removendo o ultimo elemento da pilha: Sakura
        System.out.println("Removendo o ultimo elemento da pilha: " + ninjasComStack.pop());
        //Retonando o elemento do topo: Hinata
        System.out.println("Retornando o elemento do topo: " + ninjasComStack.peek());
        System.out.println("Pilha: " + ninjasComStack);

        //Utilizando deque
        Deque<Integer> idadeNinja = new ArrayDeque<>();
        idadeNinja.push(10);
        idadeNinja.push(20);
        idadeNinja.push(30);
        idadeNinja.push(40);
        //Removendo o ultimo elemento da pilha: 40
        System.out.println("Removendo o ultimo elemento da pilha: " + idadeNinja.pop());
        //Retornando o elemento do topo: 30
        System.out.println("Retornando o elemento do topo: " + idadeNinja.peek());
        System.out.println("Pilha: " + idadeNinja);
    }
}
