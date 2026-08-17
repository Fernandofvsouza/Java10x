package com.souza.fernando.batismoJava.aulas.nivelIntermediario.Kenums;

public enum RankDeMissoes {
    D("Baixissimo", 2),
    C("Baixo", 3),
    B("Moderado", 4),
    A("Dificil", 5),
    S("Altissimo", 8);

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }
}
