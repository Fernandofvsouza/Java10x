package com.souza.fernando.batismoJava.desafios.d04;

import java.util.List;

public class ninjaBasico implements Ninja {
    private String nome;
    private int idade;
    private String habilidade;
    private List<TipoHabilidade> habilidades;

    public ninjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {
       System.out.println("Nome: " + nome);
       System.out.println("Idade: " + idade);
       System.out.println("Habilidade: " + habilidade);
    }

    @Override
    public void executarHabilidade() {
       System.out.println("Ativar habilidade: " + habilidade);
    }

    public void adicionarTipoHabilidade(TipoHabilidade tipoHabilidade) {
        habilidades.add(tipoHabilidade);
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

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }
}
