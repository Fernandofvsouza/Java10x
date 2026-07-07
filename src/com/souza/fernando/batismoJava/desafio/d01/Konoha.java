package com.souza.fernando.batismoJava.desafio.d01;

public class Konoha {
    static void main(String[] args) {
        Ninja ninja1 = new Ninja("Naruto Uzumaki", 17, "Resgatar Sasuke Uchiha", 'A');
        Ninja ninja2 = new Ninja("Sasuke Uchiha", 20, "Vingar a morte de seu clã", 'S');
        Ninja ninja3 = new Ninja("Sakura Haruno", 18, "Proteger a vila de Konoha", 'B');

        System.out.println("Nome: " + ninja1.getNome() + ", Idade: " + ninja1.getIdade() + ", Missão: " + ninja1.getMissao() + ", Nível da Missão: " + ninja1.getNivelMissao());
        System.out.println("Nome: " + ninja2.getNome() + ", Idade: " + ninja2.getIdade() + ", Missão: " + ninja2.getMissao() + ", Nível da Missão: " + ninja2.getNivelMissao());
        System.out.println("Nome: " + ninja3.getNome() + ", Idade: " + ninja3.getIdade() + ", Missão: " + ninja3.getMissao() + ", Nível da Missão: " + ninja3.getNivelMissao());

        if(ninja1.getNivelMissao() == 'A'){
            ninja1.setConclusaoMissao(true);
        }
        if(ninja2.getNivelMissao() == 'A'){
            ninja2.setConclusaoMissao(true);
        }
        if(ninja3.getNivelMissao() == 'A'){
            ninja3.setConclusaoMissao(true);
        }

        if(ninja1.getIdade() <= 15){
            ninja1.setMissao("Treinar para se tornar um ninja mais forte");
            ninja1.setNivelMissao('C');
        }
        if(ninja2.getIdade() <= 15){
            System.out.println("Sasuke ainda é muito jovem para realizar missões perigosas.");
            ninja2.setNivelMissao('D');
        }
        if (ninja3.getIdade() <= 15){
            System.out.println("Sakura ainda é muito jovem para realizar missões perigosas.");
            ninja3.setNivelMissao('D');
        }
    }
}