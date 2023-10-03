package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ZonaRuralTest {
    
    @Test
    void deveRetornarPrecoAlimentoEmZonaRural() {
        Regiao zonaRural = new ZonaRural(100);
        Alimentos arroz = new Alimentos();
        zonaRural.setProduto(arroz);
        assertEquals(105.0f, zonaRural.calcularPrecoFinal(),0.01f);
    }

    @Test
    void deveRetornarPrecoTecnologiaEmZonaRural() {
        Regiao zonaRural = new ZonaRural(100);
        Tecnologia celular = new Tecnologia();
        zonaRural.setProduto(celular);
        assertEquals(120.0f, zonaRural.calcularPrecoFinal(), 0.01f);
    }

    @Test
    void deveRetornarPrecoLimpezaEmZonaRural() {
        Regiao zonaRural = new ZonaRural(100);
        Limpeza aguaSanitaria = new Limpeza();
        zonaRural.setProduto(aguaSanitaria);
        assertEquals(110.0f, zonaRural.calcularPrecoFinal(), 0.01f);
    }
}