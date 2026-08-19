package com.souza.fernando.batismoJava.aulas.nivelIntermediario.Mgenerics;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T>{
    private List<T> itens;

    public BolsaNinja(){
        this.itens = new ArrayList<>();
    }

    public void adicionaItem(T item){
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
        return "Bolsa de equipamentos: " + itens.toString();
    }
}
