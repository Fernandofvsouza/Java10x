package com.souza.fernando.batismoJava.exerciciosTreino.SistemaFolhaPagamento;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        Funcionario renan = new Gerente("Renan", 5000.0, 1000.0);
        Funcionario maikol = new Estagiario("Maikol", 0.0, 500.0);
        Funcionario junin = new Vendedor("Junin", 3000.0, 200, 0.10);
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(renan);
        funcionarios.add(maikol);
        funcionarios.add(junin);

        for (Funcionario funcionario : funcionarios) {
            System.out.println("-----------------------------");
            funcionario.exibirDados();
        }
    }
}
