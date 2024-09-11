package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HamburguerTest {

    @Test
    void deveRetornarPrecoHamburguerSimples() {
        Hamburguer hamburguer = new HamburguerSimples();
        assertEquals(5.00f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarDescricaoHamburguerSimples() {
        Hamburguer hamburguer = new HamburguerSimples();
        assertEquals("Hambúrguer Simples", hamburguer.getDescricao());
    }

    @Test
    void deveRetornarPrecoHamburguerComQueijo() {
        Hamburguer hamburguer = new Queijo(new HamburguerSimples());
        assertEquals(6.00f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarDescricaoHamburguerComQueijo() {
        Hamburguer hamburguer = new Queijo(new HamburguerSimples());
        assertEquals("Hambúrguer Simples, Queijo", hamburguer.getDescricao());
    }

    @Test
    void deveRetornarPrecoHamburguerComBatataPalha() {
        Hamburguer hamburguer = new BatataPalha(new HamburguerSimples());
        assertEquals(5.50f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarDescricaoHamburguerComBatataPalha() {
        Hamburguer hamburguer = new BatataPalha(new HamburguerSimples());
        assertEquals("Hambúrguer Simples, BatataPalha", hamburguer.getDescricao());
    }

    @Test
    void deveRetornarPrecoHamburguerComBacon() {
        Hamburguer hamburguer = new Bacon(new HamburguerSimples());
        assertEquals(7.50f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarDescricaoHamburguerComBacon() {
        Hamburguer hamburguer = new Bacon(new HamburguerSimples());
        assertEquals("Hambúrguer Simples, Bacon", hamburguer.getDescricao());
    }

    @Test
    void deveRetornarPrecoHamburguerComQueijoEBacon() {
        Hamburguer hamburguer = new Bacon(new Queijo(new HamburguerSimples()));
        assertEquals(8.50f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarDescricaoHamburguerComQueijoEBacon() {
        Hamburguer hamburguer = new Bacon(new Queijo(new HamburguerSimples()));
        assertEquals("Hambúrguer Simples, Queijo, Bacon", hamburguer.getDescricao());
    }

    @Test
    void deveRetornarPrecoHamburguerComQueijoEBatataPalha() {
        Hamburguer hamburguer = new BatataPalha(new Queijo(new HamburguerSimples()));
        assertEquals(6.50f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarDescricaoHamburguerComQueijoEBatataPalha() {
        Hamburguer hamburguer = new BatataPalha(new Queijo(new HamburguerSimples()));
        assertEquals("Hambúrguer Simples, Queijo, BatataPalha", hamburguer.getDescricao());
    }

    @Test
    void deveRetornarPrecoHamburguerComQueijoEBaconEBatataPalha() {
        Hamburguer hamburguer = new BatataPalha(new Bacon(new Queijo(new HamburguerSimples())));
        assertEquals(9.00f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarDescricaoHamburguerComQueijoEBaconEBatataPalha() {
        Hamburguer hamburguer = new BatataPalha(new Bacon(new Queijo(new HamburguerSimples())));
        assertEquals("Hambúrguer Simples, Queijo, Bacon, BatataPalha", hamburguer.getDescricao());
    }
}
