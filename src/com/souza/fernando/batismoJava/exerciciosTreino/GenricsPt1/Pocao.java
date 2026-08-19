package com.souza.fernando.batismoJava.exerciciosTreino.GenricsPt1;

public class Pocao implements ItemAventura {
    private int pontosCura;

    public Pocao(int pontosCura) {
        this.pontosCura = pontosCura;
    }

    public int getPontosCura() {
        return pontosCura;
    }

    public void setPontosCura(int pontosCura) {
        this.pontosCura = pontosCura;
    }

    @Override
    public String toString() {
        return "Pontos de cura da poção: " + getPontosCura();
    }
}
