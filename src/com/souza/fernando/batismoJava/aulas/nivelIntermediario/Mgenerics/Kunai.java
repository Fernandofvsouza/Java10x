package com.souza.fernando.batismoJava.aulas.nivelIntermediario.Mgenerics;

public class Kunai implements ItemNinja{
    private String tipo;

    public Kunai(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Kunai do tipo: " + getTipo();
    }
}
