package com.souza.fernando.batismoJava.exerciciosTreino.GenricsPt1;

public class Mapa implements ItemAventura{
    private String regiao;

    public Mapa(String regiao) {
        this.regiao = regiao;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    @Override
    public String toString() {
        return "Regiao do mapa: " + getRegiao();
    }
}
