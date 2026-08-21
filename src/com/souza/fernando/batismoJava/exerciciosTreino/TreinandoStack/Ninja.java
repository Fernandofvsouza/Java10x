package com.souza.fernando.batismoJava.exerciciosTreino.TreinandoStack;

public class Ninja {
    private String nomeNinja;
    private int idadeNinja;
    private String aldeiaNinja;

    public Ninja(String nomeNinja, int idadeNinja, String aldeiaNinja) {
        this.nomeNinja = nomeNinja;
        this.idadeNinja = idadeNinja;
        this.aldeiaNinja = aldeiaNinja;
    }

    public String getNomeNinja() {
        return nomeNinja;
    }

    public void setNomeNinja(String nomeNinja) {
        this.nomeNinja = nomeNinja;
    }

    public int getIdadeNinja() {
        return idadeNinja;
    }

    public void setIdadeNinja(int idadeNinja) {
        this.idadeNinja = idadeNinja;
    }

    public String getAldeiaNinja() {
        return aldeiaNinja;
    }

    public void setAldeiaNinja(String aldeiaNinja) {
        this.aldeiaNinja = aldeiaNinja;
    }

    @Override
    public String toString() {
        return "Ninja: " + getNomeNinja() + ", Idade: " + getIdadeNinja() + ", Aldeia: " + getAldeiaNinja();
    }
}
