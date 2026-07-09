package com.souza.fernando.batismoJava.desafios.desafioControleDieta;

import java.util.ArrayList;
import java.util.List;

public class DietaService {
    private String nome;
    private int metaCaloricaDiaria;
    private List<Alimento> alimentos = new ArrayList<>();

    public DietaService(String nome, int metaCaloricaDiaria) {
        this.nome = nome;
        this.metaCaloricaDiaria = metaCaloricaDiaria;
    }

    public void adicionarAlimento(Alimento alimento) {
        alimentos.add(alimento);
    }


    public List<Alimento> getAlimentos() {
        return alimentos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMetaCaloricaDiaria() {
        return metaCaloricaDiaria;
    }

    public void setMetaCaloricaDiaria(int metaCaloricaDiaria) {
        this.metaCaloricaDiaria = metaCaloricaDiaria;
    }
}
