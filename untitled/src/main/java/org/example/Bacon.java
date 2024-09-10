package org.example;

public class Bacon extends DecoradorHamburguer {

    public Bacon(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public float getPrecoAdicional() {
        return 1.50f;
    }

    @Override
    public String getDescricaoAdicional() {
        return "Bacon";
    }
}
