package com.souza.fernando.batismoJava.desafios.desafioControleDieta;

import java.util.ArrayList;

public class Alimento {
    private String nomeAlimento;
    private ArrayList<Integer> quantidadeCaloria = new ArrayList<>();

    public Alimento(String nomeAlimento, int quantidadeCaloria) {
        this.nomeAlimento = nomeAlimento;
        this.quantidadeCaloria.add(quantidadeCaloria);
    }


    public String getNomeAlimento() {
        return nomeAlimento;
    }

    public void setNomeAlimento(String nomeAlimento) {
        this.nomeAlimento = nomeAlimento;
    }

    public ArrayList<Integer> getQuantidadeCaloria() {
        return quantidadeCaloria;
    }

    public void setQuantidadeCaloria(ArrayList<Integer> quantidadeCaloria) {
        this.quantidadeCaloria = quantidadeCaloria;
    }
}
