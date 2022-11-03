package ufjf.br;

import java.math.BigDecimal;

public class SUV extends Carro{

    public SUV(String nome, int ano,float valorMedio) {
        super(nome, ano,valorMedio);
    }

    @Override
    public float calcularValorVenda() {
        return  (this.valorMedio *  (1 + this.marca.percentualAumento())) * 0.68f;
    }
}
