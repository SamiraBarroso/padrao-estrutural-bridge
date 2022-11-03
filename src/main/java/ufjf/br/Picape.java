package ufjf.br;

public class Picape extends Carro{
    public Picape(String nome, int ano,float valorMedio) {
        super(nome, ano,valorMedio);
    }

    @Override
    public float calcularValorVenda() {
        return  (this.valorMedio *  (1 + this.marca.percentualAumento())) * 0.70f;
    }
}
