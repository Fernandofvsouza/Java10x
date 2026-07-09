package com.souza.fernando.batismoJava.aulas.nivelIntermediario.Aheranca;

public class Main {
    static void main(String[] args) {
        //Objeto 1
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 17;
        Naruto.modoSabioAtivado();


        //Objeto 2
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.idade = 18;
        Sasuke.shariganAtivado();

        //Objeto 3
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da folha";
        Sakura.idade = 18;
        Sakura.ativarCura();

        //Objeto 4
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = "Aldeia da folha";
        Hinata.idade = 16;
        Hinata.ativarBaykugan();
    }
}
