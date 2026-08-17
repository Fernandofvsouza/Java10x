package com.souza.fernando.batismoJava.aulas.nivelIntermediario.Llist;

public class Ninja {
    private String nome;
    private String aldeia;
    private int idade;
    private final double altura = 1.80; //Nao pode ser alterada, pois é final

     public Ninja(String nome, String aldeia, int idade) {
         this.nome = nome;
         this.aldeia = aldeia;
         this.idade = idade;
     }


    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", aldeia='" + aldeia + '\'' +
                ", idade=" + idade + ", altura=" + altura +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }
}
