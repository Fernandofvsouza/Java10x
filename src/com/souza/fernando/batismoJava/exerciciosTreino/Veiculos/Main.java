package com.souza.fernando.batismoJava.exerciciosTreino.Veiculos;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
        Veiculo pcx = new Moto("Honda", "PCX", 0, "150cc");
        Veiculo gol = new Carro("Volkswagen", "Gol", 0, 4);
        Veiculo tesla = new CarroEletrico("Tesla", "Model S", 0, 4);
        veiculos.add(pcx);
        veiculos.add(gol);
        veiculos.add(tesla);

        for(Veiculo veiculo : veiculos){

            veiculo.emitirSom();
            veiculo.exibirStatus();


            System.out.println("-------------------------");

        }
    }
}
