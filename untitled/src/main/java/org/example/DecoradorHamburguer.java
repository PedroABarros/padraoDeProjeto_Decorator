package org.example;

public abstract class DecoradorHamburguer implements Hamburguer {

    private Hamburguer hamburguer;
    public String descricaoAdicional;

    public DecoradorHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    // Método abstrato para definir o preço adicional específico do decorador
    public abstract float getPrecoAdicional();

    @Override
    public float getPreco() {
        return this.hamburguer.getPreco() + this.getPrecoAdicional();
    }

    // Método abstrato para definir a descrição adicional específica do decorador
    public abstract String getDescricaoAdicional();

    @Override
    public String getDescricao() {
        return this.hamburguer.getDescricao() + ", " + this.getDescricaoAdicional();
    }

    public void setDescricaoAdicional(String descricaoAdicional) {
        this.descricaoAdicional = descricaoAdicional;
    }
}
