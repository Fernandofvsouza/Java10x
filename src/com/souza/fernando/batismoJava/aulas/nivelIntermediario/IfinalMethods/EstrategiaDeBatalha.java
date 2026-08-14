package com.souza.fernando.batismoJava.aulas.nivelIntermediario.IfinalMethods;

public interface EstrategiaDeBatalha {

    //Em interfaces variaveis são final por padrao
     final String nomeDaBatalha = "Batalha dos jeronimos";
     String dataBatalha = "10/11/18";

    //em interfaces metodos sao publicos por padrão
    public void estrategiaDeBatalha();
    void inteligenciaDeCombate();
}
