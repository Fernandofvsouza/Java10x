package com.souza.fernando.batismoJava.exerciciosTreino.NinjasI;

public class Uchiha extends Ninja {

    public Uchiha(String nome, int idade, String aldeia, String habilidadeEspecial, String estrategiaDeBatalha) {
        super(nome, idade, aldeia, habilidadeEspecial, estrategiaDeBatalha);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("O meu nome é: " + getNome() + " e minha habilidade especial é: " + getHabilidadeEspecial());
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("O meu nome é: " + getNome() + " e minha estratégia de batalha é: " +  getEstrategiaDeBatalha());
    }



}
