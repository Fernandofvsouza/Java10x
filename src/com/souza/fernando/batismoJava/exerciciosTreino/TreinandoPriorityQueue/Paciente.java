package com.souza.fernando.batismoJava.exerciciosTreino.TreinandoPriorityQueue;

public class Paciente implements Comparable<Paciente>{
    private String nome;
    private int gravidade;

    public Paciente(String nome, int gravidade) {
        this.nome = nome;
        this.gravidade = gravidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getGravidade() {
        return gravidade;
    }

    public void setGravidade(int gravidade) {
        this.gravidade = gravidade;
    }


    @Override
    public String toString() {
        return "Paciente: " + getNome() + " ,gravidade: " + getGravidade();
    }

    @Override
    public int compareTo(Paciente o) {
        if(this.gravidade < o.gravidade){
            return -1;
        } else if (this.gravidade > o.gravidade) {
            return 1;
        } else {
            return 0;
            
        }
    }
}
