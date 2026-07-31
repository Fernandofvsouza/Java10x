package com.souza.fernando.batismoJava.desafios.d04;

public class Main {
    static void main(String[] args) {
        NinjaBasico ninja1 = new NinjaBasico("Naruto", 17, "Rinnengan");
        ninja1.mostrarInformacoes();
        ninja1.adicionarTipoHabilidade(TipoHabilidade.RINNENGAN);
        ninja1.executarHabilidade();

        System.out.println("---------------");
        NinjaAvancado ninja2 = new NinjaAvancado("Sasuke", 18, "Sharingan", "Genjutsu");
        ninja2.mostrarInformacoes();
        ninja2.adicionarTipoHabilidade(TipoHabilidade.GENJUTSU);
        ninja2.executarHabilidade();
    }
}
