package com.souza.fernando.batismoJava.desafios.d02;

import java.util.Scanner;

public class Ninja {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos ninjas voce gostaria de cadastrar ?");
        int quantidade = input.nextInt();
        String[] nomes = new String[quantidade];


        while(true){
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = input.nextInt();
            switch(opcao){
                case 1:
                    for(int i = 0; i < nomes.length; i++){
                        System.out.println("Digite o nome do " + (i+1) + " ninja: ");
                        nomes[i] = input.next();
                    }
                    System.out.println("Ninjas cadastrados com sucesso!");
                    break;
                case 2:
                    for(int i = 0; i < nomes.length; i++){
                        if(nomes[i] == null){
                            System.out.println("Indice " + i + " Está vazio");
                        }else{
                            System.out.println("Nome do " + (i+1) + " ninja: " + nomes[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

    }
}
