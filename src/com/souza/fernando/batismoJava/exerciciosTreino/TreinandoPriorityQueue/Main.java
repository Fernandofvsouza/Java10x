package com.souza.fernando.batismoJava.exerciciosTreino.TreinandoPriorityQueue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("João", 3);
        Paciente p2 = new Paciente("Maria", 1);
        Paciente p3 = new Paciente("José", 5);

        PriorityQueue<Paciente> filaHospital = new PriorityQueue<>();
        filaHospital.offer(p1);
        filaHospital.offer(p2);
        filaHospital.offer(p3);

        while(!filaHospital.isEmpty()){
            System.out.println(filaHospital.poll());
        }
        System.out.println("Todos os pacientes foram atendidos!");
    }
}
