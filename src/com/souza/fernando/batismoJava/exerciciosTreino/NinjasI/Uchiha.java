package com.souza.fernando.batismoJava.exerciciosTreino.NinjasI;

public class Uchiha extends Ninja {
    private String habilidadeEspecial;
    private String estrategiaDeBatalha;
    public  Uchiha(String nome, int idade, String aldeia, String habilidadeEspecial, String estrategiaDeBatalha) {
        super.setNome(nome);
        super.setIdade(idade);
        super.setAldeia(aldeia);
        this.habilidadeEspecial = habilidadeEspecial;
        this.estrategiaDeBatalha = estrategiaDeBatalha;
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("O meu nome é: " + getNome() + " e minha habilidade especial é: " + habilidadeEspecial);
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("O meu nome é: " + getNome() + " e minha estratégia de batalha é: " +  estrategiaDeBatalha);
    }


    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    public void setHabilidadeEspecial(String habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public String getEstrategiaDeBatalha() {
        return estrategiaDeBatalha;
    }

    public void setEstrategiaDeBatalha(String estrategiaDeBatalha) {
        this.estrategiaDeBatalha = estrategiaDeBatalha;
    }
}
