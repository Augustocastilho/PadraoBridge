package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GrandeCentroTest {

    @Test
    void deveRetornarPrecoAlimentoEmGrandeCentro() {
        Regiao grandeCentro = new GrandeCentro(100);
        Alimentos arroz = new Alimentos();
        grandeCentro.setProduto(arroz);
        assertEquals(115.0f, grandeCentro.calcularPrecoFinal(), 0.01f);
    }

    @Test
    void deveRetornarPrecoTecnologiaEmGrandeCentro() {
        Regiao grandeCentro = new GrandeCentro(100);
        Tecnologia celular = new Tecnologia();
        grandeCentro.setProduto(celular);
        assertEquals(130.0f, grandeCentro.calcularPrecoFinal(), 0.01f);
    }

    @Test
    void deveRetornarPrecoLimpezaEmGrandeCentro() {
        Regiao grandeCentro = new GrandeCentro(100);
        Limpeza aguaSanitaria = new Limpeza();
        grandeCentro.setProduto(aguaSanitaria);
        assertEquals(120.0f, grandeCentro.calcularPrecoFinal(), 0.01f);
    }

}