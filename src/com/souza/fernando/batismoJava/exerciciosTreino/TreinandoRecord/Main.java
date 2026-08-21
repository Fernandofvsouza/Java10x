package com.souza.fernando.batismoJava.exerciciosTreino.TreinandoRecord;

public class Main {
    static void main(String[] args) {
        Resultado resultado = new Resultado(true, "Operação realizada com sucesso!");
        System.out.println("Obtivemos sucesso ? " + resultado.sucesso());
        System.out.println("Mensagem: " + resultado.mensagem());
    }
}
