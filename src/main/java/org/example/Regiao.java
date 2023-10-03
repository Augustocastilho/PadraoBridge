package org.example;

public abstract class Regiao {

    protected Produto produto;

    protected float precoBase;

    public Regiao(float precoBase) { this.precoBase = precoBase; }

    public void setProduto(Produto produto) { this.produto = produto; }

    public abstract float calcularPrecoFinal();
}
