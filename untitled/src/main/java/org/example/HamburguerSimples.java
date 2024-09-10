package org.example;

public class HamburguerSimples implements Hamburguer {

    @Override
    public float getPreco() {
        return 5.00f;
    }

    @Override
    public String getDescricao() {
        return "Hambúrguer Simples";
    }
}
