package com.souza.fernando.batismoJava.exerciciosTreino.NinjasI;

public class Main {
    static void main(String[] args) {
        Ninja[] ninjas = {

                new Uzumaki(

                        "Naruto",

                        17,

                        "Aldeia da Folha",

                        "Rasengan",

                        "Ataque surpresa"

                ),

                new Uchiha(

                        "Sasuke",

                        17,

                        "Aldeia da Folha",

                        "Sharingan",

                        "Combate corpo a corpo"

                )

        };
        for(Ninja ninja : ninjas){
            ninja.apresentar();
            ninja.habilidadeEspecial();
            ninja.estrategiaDeBatalha();
        }





    }
}
