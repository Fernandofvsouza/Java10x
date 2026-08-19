package com.souza.fernando.batismoJava.exerciciosTreino.GenricsPt1;

public class Espada implements ItemAventura {
    private int dano;

    public Espada(int dano) {
        this.dano = dano;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    @Override
    public String toString() {
        return "Dano da espada: " + getDano();
    }
}
