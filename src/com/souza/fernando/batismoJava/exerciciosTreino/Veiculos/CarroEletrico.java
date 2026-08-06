package com.souza.fernando.batismoJava.exerciciosTreino.Veiculos;

public class CarroEletrico extends Carro implements Eletrico{

    public CarroEletrico(String modelo, String marca, int velocidadeAtual, int numeroPortas) {
        super(modelo, marca, velocidadeAtual, numeroPortas);

    }

    @Override
    public void carregarBateria() {
        System.out.println("O carro elétrico está carregando a bateria.");
    }
    @Override
    public void exibirStatus(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Velocidade atual: " + getVelocidadeAtual());
        System.out.println("Numero Portas: " + getNumeroPortas());
        carregarBateria();
    }
}
