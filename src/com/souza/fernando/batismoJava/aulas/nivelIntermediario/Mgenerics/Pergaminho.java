package com.souza.fernando.batismoJava.aulas.nivelIntermediario.Mgenerics;

public class Pergaminho implements ItemNinja{
    private String descricao;

    public Pergaminho(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    @Override
    public String toString() {
        return "Pergaminho com a seguinte descrição: " + getDescricao();
    }
}
