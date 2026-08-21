package com.souza.fernando.batismoJava.exerciciosTreino.TreinandoStack;

import java.util.Stack;

public class Main {
    static void main(String[] args) {
        Ninja ninja1 = new Ninja("Naruto Uzumaki", 17, "Konoha");
        Ninja ninja2 = new Ninja("Sasuke Uchiha", 17, "Konoha");
        Ninja ninja3 = new Ninja("Sakura Haruno", 17, "Konoha");

        Stack<Ninja> stack = new Stack<>();
        stack.push(ninja1);
        stack.push(ninja2);
        stack.push(ninja3);
        stack.pop();

        for(Ninja n : stack){
            System.out.println(n);
        }
    }
}
