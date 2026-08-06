package com.souza.fernando.batismoJava.exerciciosTreino.Veiculos;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int velocidadeAtual = 0;

    public Veiculo(String marca, String modelo, int velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
    }
    public void acelerar(){
        velocidadeAtual++;
    }

    public abstract void emitirSom();

    public void exibirStatus(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade atual: " + velocidadeAtual);
    }


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
}
