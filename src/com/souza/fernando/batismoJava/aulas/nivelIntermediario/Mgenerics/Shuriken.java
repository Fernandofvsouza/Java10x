package com.souza.fernando.batismoJava.aulas.nivelIntermediario.Mgenerics;

public class Shuriken implements ItemNinja{
    private int tamanho;

    public Shuriken(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Shuriken de tamanho: " + getTamanho();
    }
}
