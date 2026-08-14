package com.souza.fernando.batismoJava.aulas.nivelIntermediario.Jencapsulamento;




public class Main {
    static void main(String[] args) {
        System.out.println("------------Naruto Uzumaki----------------");
        Ninja naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da folha", 16);
        //Referencia de memoria
        System.out.println(naruto); //Saida: objeto de referencia da memoria
        //toString(), pega essa referencia de memoria e transforma em um valor
        System.out.println(naruto);  //Apos a criação do toString(), agora naruto retorna o valor do objeto;
        naruto.tacarKunai();
        naruto.setNome("Naruto Uzumaki da Folha");
        System.out.println(naruto.getNome());




        System.out.println("--------------- Sasuke Uchiha ----------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da folha", 18);
        System.out.println(sasuke);
        sasuke.setAldeia("Aldeia do Ar");
        System.out.println(sasuke.getAldeia());



    }
}
