package com.souza.fernando.batismoJava.aulas.nivelIntermediario.Binterface;


import com.souza.fernando.batismoJava.aulas.nivelIntermediario.Binterface.Uzumaki;

public class Main {
    static void main(String[] args) {
        Boruto boruto = new Boruto();
        boruto.nome = "Boruto Uzumaki";
        boruto.aldeia = "Aldeia da folha";
        boruto.idade = 23;
        boruto.AtivarOKarma();
        boruto.ativarJougan();
        boruto.modoSabioAtivado();
    }
}
