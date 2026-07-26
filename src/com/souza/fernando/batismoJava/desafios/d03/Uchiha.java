package com.souza.fernando.batismoJava.desafios.d03;

public class Uchiha extends Ninja {
    private String habilidadeEspecial;
    public Uchiha(String nome, int idade, String missao, String nivelDificuldade, String statusMissao, String habilidadeEspecial) {
        super(nome, idade, missao, nivelDificuldade, statusMissao);
        this.habilidadeEspecial = habilidadeEspecial;
    }
    public void mostrarHabilidadeEspecial() {
        System.out.println("Habilidade especial: " + habilidadeEspecial);
    }


    @Override
    public void mostrarInfo() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Missao: " + this.getMissao());
        System.out.println("Nivel dificuldade: " + this.getNivelDificuldade());
        System.out.println("Status: " + this.getStatusMissao());
        System.out.println("Habilidade especial: " + this.getHabilidadeEspecial());
    }

    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    public void setHabilidadeEspecial(String habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }
}
