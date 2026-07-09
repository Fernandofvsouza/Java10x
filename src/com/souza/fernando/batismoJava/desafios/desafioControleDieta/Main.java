package com.souza.fernando.batismoJava.desafios.desafioControleDieta;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite a sua meta calórica diária: ");
        int metaCaloricaDiaria = input.nextInt();
        DietaService dieta = new DietaService(nome, metaCaloricaDiaria);

        while (true) {
            System.out.println("----- MENU ------");
            System.out.println( "1 - Adicionar alimento consumido");
            System.out.println("2 - Ver total de calorias do dia");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            int opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do alimento: ");
                    String nomeAlimento = input.nextLine();

                    System.out.println("Digite a quantidade de calorias do alimento: ");
                    int quantidadeCaloria = input.nextInt();
                    Alimento alimento = new Alimento(nomeAlimento, quantidadeCaloria);
                    dieta.adicionarAlimento(alimento);
                    System.out.println("Alimento adicionado com sucesso!");
                    break;



                case 2:
                    System.out.println("Olá, " + dieta.getNome());
                    System.out.println("Alimentos consumidos hoje: ");
                    int totalCalorias = 0;
                    for (Alimento a : dieta.getAlimentos()) {
                        int caloriasDesseAlimento = 0;
                        for (int c : a.getQuantidadeCaloria()) {
                            caloriasDesseAlimento += c;
                        }
                        System.out.println("- " + a.getNomeAlimento() + ": " + caloriasDesseAlimento + " kcal");
                        totalCalorias += caloriasDesseAlimento;
                    }
                    System.out.println("Total de calorias consumidas hoje: " + totalCalorias + " kcal");

                    break;
                    case 0:
                        System.exit(0);
                        break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                            break;
            }
        }
    }
}
