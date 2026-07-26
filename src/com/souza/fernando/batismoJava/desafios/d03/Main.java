package com.souza.fernando.batismoJava.desafios.d03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Uchiha ninja01 = new Uchiha("Uchiha Itachi", 21, "Missão de infiltração", "Alta", "Em andamento", "Sharingan");
        Uchiha ninja02 = new Uchiha("Uchiha Sasuke", 17, "Missão de vingança", "Alta", "Em andamento", "Mangekyou Sharingan");
        List<Uchiha> listaUchiha = new ArrayList<>();
        listaUchiha.add(ninja01);
        listaUchiha.add(ninja02);
        int opcao;
        do{
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Mostrar informações dos ninjas");
            System.out.println("2 - Adicionar um novo ninja na lista");
            System.out.println("3 - Atualizar habilidade especial");
            System.out.println("0 - Sair");
            opcao = input.nextInt();

            switch(opcao){
                case 1:
                    for(Uchiha u : listaUchiha){
                        System.out.println("--------------------");
                        u.mostrarInfo();
                    }
                    break;
                    case 2:
                        System.out.println("Digite o nome do novo ninja:");
                        String nome = input.next();
                        System.out.println("Digite a idade do novo ninja:");
                        int idade = input.nextInt();
                        input.nextLine();
                        System.out.println("Digite a missão do novo ninja:");
                        String missao = input.next();
                        System.out.println("Digite o nível de dificuldade da missão:");
                        String nivelDificuldade = input.next();
                        System.out.println("Digite o status da missão:");
                        String statusMissao = input.next();
                        System.out.println("Digite a habilidade especial:");
                        String habilidadeEspecial = input.next();
                        Uchiha ninjaNovo = new Uchiha(nome, idade, missao, nivelDificuldade, statusMissao, habilidadeEspecial);
                        listaUchiha.add(ninjaNovo);
                        System.out.println("Ninja adicionado com sucesso!");
                        break;
                        case 3:
                            for(int i = 0; i < listaUchiha.size(); i++){
                                System.out.println("Atualizar a habilidade especial do ninja " + (i+1) );
                                System.out.println("Digite a nova habilidade especial:");
                                String habilidade = input.next();
                                listaUchiha.get(i).setHabilidadeEspecial(habilidade);
                                System.out.println("Ninja atualizado com sucesso!");

                            }
                            break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }while(opcao != 0);


    }
}
