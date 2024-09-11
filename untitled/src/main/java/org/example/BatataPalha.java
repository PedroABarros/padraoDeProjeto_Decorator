package org.example;

public class BatataPalha extends DecoradorHamburguer {

    public BatataPalha(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public float getPrecoAdicional() {
        return 0.50f;
    }

    @Override
    public String getDescricaoAdicional() {
        return "BatataPalha";
    }
}
