package com.souza.fernando.batismoJava.exerciciosTreino.SobrecarregandoConstrutores;

public class Gato extends Animal {
    private String tipoPelo;
    public Gato(){

    }
    public Gato(String nome, int idade, String raca, double peso, String comidaPreferida, int quantidadeComida, String tipoPelo) {
        super(nome, idade, raca, peso, comidaPreferida, quantidadeComida);
        this.tipoPelo = tipoPelo;
    }

    @Override
    public void fazerBarulho() {
        System.out.println("O gato(a) " + getNome() + " está miando.");
    }



    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }
}
