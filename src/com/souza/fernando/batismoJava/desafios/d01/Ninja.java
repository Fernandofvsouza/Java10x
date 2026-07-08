package com.souza.fernando.batismoJava.desafios.d01;

public class Ninja {
    private String nome;
    private int idade;
    private String missao;
    private char nivelMissao;
    private boolean conclusaoMissao;

    public Ninja(String nome, int idade, String missao, char nivelMissao) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.nivelMissao = nivelMissao;
        this.conclusaoMissao = false;
    }




    public boolean isConclusaoMissao() {
        return conclusaoMissao;
    }

    public void setConclusaoMissao(boolean conclusaoMissao) {
        this.conclusaoMissao = conclusaoMissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMissao() {
        return missao;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public char getNivelMissao() {
        return nivelMissao;
    }

    public void setNivelMissao(char nivelMissao) {
        this.nivelMissao = nivelMissao;
    }
}
