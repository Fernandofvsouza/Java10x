package com.souza.fernando.batismoJava.desafio.desafioCrudUsers;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UsuarioService usuarioService = new UsuarioService(new ArrayList<>());

        while (true) {
            System.out.println("------ MENU -------");
            System.out.println("1 - Cadastrar Usuario");
            System.out.println("2 - Listar Usuarios");
            System.out.println("3 - Atualizar Usuario");
            System.out.println("4 - Excluir Usuario");
            System.out.println("0 - Sair");
            int opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1:
                    try{
                    System.out.println("Digite o nome do usuario: ");
                    String nome = input.nextLine();
                    System.out.println("Digite o email do usuario: ");
                    String email = input.nextLine();
                    usuarioService.cadastrarUsuario(nome, email);
                    System.out.println("Usuario cadastrado com sucesso");}
                    catch (NomeInvalidoException | EmailInvalidoException e) {
                        System.out.println("Erro ao cadastrar usuario: " + e.getMessage());
                    }
                    break;
                case 2:
                    if(!usuarioService.listarUsuarios()){
                        System.out.println("Nenhum usuario cadastrado");

                    }
                    break;
                case 3:
                    System.out.println("Digite o id do usuario a ser atualizado: ");
                    int id = input.nextInt();
                    input.nextLine();

                    if(usuarioService.buscarPorId(id) == -1){
                        System.out.println("Usuario nao encontrado");
                    }else{
                        System.out.println("Digite o nome do usuario atualizado: ");
                        String nomeAtualizado = input.nextLine();
                        System.out.println("Digite o email do usuario atualizado: ");
                        String emailAtualizado = input.nextLine();
                        usuarioService.atualizarUsuario(id, nomeAtualizado, emailAtualizado);
                        System.out.println("Usuario atualizado com sucesso");
                    }
                    break;
                case 4:
                    System.out.println("Digite o id do usuario a ser excluir: ");
                    int idExcluir = input.nextInt();
                    if(usuarioService.buscarPorId(idExcluir) == -1){
                        System.out.println("Usuario nao encontrado");
                    }else{
                        usuarioService.excluirUsuario(idExcluir);
                        System.out.println("Usuario excluido com sucesso");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break ;
                    default:
                        System.out.println("Opcao invalida");
            }

        }
    }
}
