package com.souza.fernando.batismoJava.desafios.desafioCalculadora;

public class Calculadora {
    private double n1;
    private double n2;

    public Calculadora(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    //Soma
    public double somar() {
        return n1 + n2;
    }

    //Subtração
    public double subtrair(){
        return n1 - n2;
    }

    //Multiplicação
    public double multiplicar(){
        return n1 * n2;
    }

    public double dividir(){
        return n1 / n2;
    }

    public void mudarNumero(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;

    }



    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }
}
