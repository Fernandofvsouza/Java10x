package com.souza.fernando.batismoJava.exerciciosTreino.GenricsPt1;

import java.util.ArrayList;
import java.util.List;

public class Bau<T> {
    private List<T> itens;
    public Bau() {
        this.itens = new ArrayList<>();
    }

   public void adicionarItem(T item){
        this.itens.add(item);
   }

    public List<T> getItens() {
        return itens;
    }

    public void setItens(List<T> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Bau de equipamentos: " + itens.toString();
    }
}
