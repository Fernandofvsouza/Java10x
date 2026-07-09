package com.souza.fernando.batismoJava.desafios.desafioCalculadora;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double n1 = input.nextDouble();
        System.out.println("Digite o segundo número: ");
        double n2 = input.nextDouble();
        Calculadora calculadora = new Calculadora(n1, n2);
        while (true){
            System.out.println("Escolha uma operação: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Alterar números");
            System.out.println("0 - Sair");
            int opcao = input.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Resultado da soma: " + calculadora.somar());

                    break;
                case 2:
                    System.out.println("Resultado da subtração: " + calculadora.subtrair());
                    break;
                case 3:
                    System.out.println("Resultado da multiplicação: " + calculadora.multiplicar());
                    break;
                case 4:
                    System.out.println("Resultado da divisão: " + calculadora.dividir());
                    break;
                case 5:
                    System.out.println("Digite o primeiro número: ");
                    n1 = input.nextDouble();
                    System.out.println("Digite o segundo número: ");
                    n2 = input.nextDouble();
                    calculadora.mudarNumero(n1, n2);
                    System.out.println("Os números foram alterados para: " + calculadora.getN1() + " e " + calculadora.getN2());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    input.close();
                    System.exit(0);
                    break;
                    default:
                        System.out.println("Opção inválida");

            }
        }
    }
}
