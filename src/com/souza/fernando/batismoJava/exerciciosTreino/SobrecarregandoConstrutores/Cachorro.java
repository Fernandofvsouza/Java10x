package com.souza.fernando.batismoJava.exerciciosTreino.SobrecarregandoConstrutores;

public class Cachorro extends Animal {
    private String qtdVezesPassear;

    public Cachorro() {

    }

    public Cachorro(String nome, int idade, String raca, double peso, String comidaPreferida, int quantidadeComida, String qtdVezesPassear) {
        super(nome, idade, raca, peso, comidaPreferida, quantidadeComida);
        this.qtdVezesPassear = qtdVezesPassear;
    }

    @Override
    public void fazerBarulho() {
        System.out.println("O cachorro(a) " + getNome() + " está latindo.");
    }





    public String getQtdVezesPassear() {
        return qtdVezesPassear;
    }

    public void setQtdVezesPassear(String qtdVezesPassear) {
        this.qtdVezesPassear = qtdVezesPassear;
    }
}
