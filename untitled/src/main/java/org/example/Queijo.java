package org.example;

public class Queijo extends DecoradorHamburguer {

    public Queijo(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public float getPrecoAdicional() {
        return 1.00f;
    }

    @Override
    public String getDescricaoAdicional() {
        return "Queijo";
    }
}
