package org.example;

public class GrandeCentro extends Regiao{

    public GrandeCentro (float precoBase) {
        super(precoBase);
    }

    @Override
    public float calcularPrecoFinal() {
        return this.precoBase * (1 + this.produto.percentualReajuste());
    }
}

