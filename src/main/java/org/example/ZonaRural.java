package org.example;

public class ZonaRural extends Regiao {

    public ZonaRural (float precoBase) {
        super(precoBase);
    }

    @Override
    public float calcularPrecoFinal() {
        return this.precoBase * (0.9f + this.produto.percentualReajuste());
    }

}
