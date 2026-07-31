package com.souza.fernando.batismoJava.desafios.d04;

public class Main {
    static void main(String[] args) {
        ninjaBasico ninja1 = new ninjaBasico("Naruto", 17, "Rinnengan");
        ninja1.mostrarInformacoes();
        ninja1.adicionarTipoHabilidade(TipoHabilidade.RINNENGAN);
        ninja1.executarHabilidade();
    }
}
