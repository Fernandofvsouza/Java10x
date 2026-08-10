package com.souza.fernando.batismoJava.aulas.nivelIntermediario.Gsobrecargadeconstrutores;

public class Main {
    static void main(String[] args) {
        Ninja naruto = new Uchiha();
        naruto.nome = "Naruto Uchiha";
        naruto.idade = 17;
        naruto.aldeia = "Konoha";
        naruto.numeroDeMissoesConcluidas = 3;
        naruto.rank = NivelNinja.GENIN;



    }
}
