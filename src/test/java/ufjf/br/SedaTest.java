package ufjf.br;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SedaTest {
    @Test
    void deveRetornarValorSedaDaChery() {
        Marca marca = new Chery();
        Seda seda = new Seda("Arrizo 6",2019,85000.00f);
        seda.setMarca(marca);
        assertEquals(71824.99f, seda.calcularValorVenda(), 0.01f);
    }

    @Test
    void deveRetornarValorSedaDaHyundai() {
        Marca marca = new Hyundai();
        Seda seda = new Seda("HB20S",2018,75000.00f);
        seda.setMarca(marca);
        assertEquals(58499.99f, seda.calcularValorVenda(), 0.01f);
    }

    @Test
    void deveRetornarValorSedaDaFiat() {
        Marca marca = new Fiat();
        Seda seda = new Seda("Cronos",2021,92000.00f);
        seda.setMarca(marca);
        assertEquals(65780.00f, seda.calcularValorVenda(), 0.01f);
    }

}