package com.souza.fernando.batismoJava.exerciciosTreino.SobrecarregandoConstrutores;

public abstract class Animal {
    private String nome;
    private int idade;
    private String raca;
    private double peso;
    private String comidaPreferida;
    private int quantidadeComida;

    public Animal(){

    }

    public Animal(String nome, int idade, String raca, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.peso = peso;
    }

    public Animal(String nome, int idade, String raca, double peso, String comidaPreferida, int quantidadeComida) {
        this(nome, idade, raca, peso);
        this.comidaPreferida = comidaPreferida;
        this.quantidadeComida = quantidadeComida;
    }

    public void dormir(){
        System.out.println("O(a) animal " + nome + " está dormindo.");
    }



    public abstract void fazerBarulho();

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

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getComidaPreferida() {
        return comidaPreferida;
    }

    public void setComidaPreferida(String comidaPreferida) {
        this.comidaPreferida = comidaPreferida;
    }

    public int getQuantidadeComida() {
        return quantidadeComida;
    }

    public void setQuantidadeComida(int quantidadeComida) {
        this.quantidadeComida = quantidadeComida;
    }
}
