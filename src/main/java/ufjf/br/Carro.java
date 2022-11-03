package ufjf.br;

import java.math.BigDecimal;

public abstract  class Carro {

    protected String nome;
    protected Marca marca;
    protected int ano;

    protected float valorMedio;

    public Carro(String nome, int ano, float valorMedio) {
        this.nome = nome;
        this.ano = ano;
        this.valorMedio = valorMedio;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setValoFipe(float valorFipe) {
        this.valorMedio = valorFipe;
    }

    abstract public float calcularValorVenda();
}
