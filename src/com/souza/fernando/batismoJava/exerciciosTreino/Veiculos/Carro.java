package com.souza.fernando.batismoJava.exerciciosTreino.Veiculos;

public class Carro extends Veiculo {
    private int numeroPortas;
    public Carro (String marca, String modelo, int velocidadeAtual, int numeroPortas) {
        super(marca, modelo, velocidadeAtual);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void emitirSom() {
        System.out.println("O carro está emitindo som: Vrum Vrum!");
    }



    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}
