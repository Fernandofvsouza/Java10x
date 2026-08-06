package com.souza.fernando.batismoJava.exerciciosTreino.Veiculos;

public class Moto extends Veiculo {
    private String cilindrada;
    public Moto(String marca, String modelo, int velocidadeAtual, String cilindrada) {
        super(marca, modelo, velocidadeAtual);
        this.cilindrada = cilindrada;
    }

    @Override
    public void emitirSom() {
        System.out.println("A moto está emitindo som: Brrr Brrr!");
    }




    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
}
