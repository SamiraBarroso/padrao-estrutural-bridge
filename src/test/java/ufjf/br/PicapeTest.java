package ufjf.br;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PicapeTest {
    @Test
    void deveRetornarValorPicapeDaChery() {
        Marca marca = new Chery();
        Picape picape = new Picape("Tiggo Cross",2019,120000.00f);
        picape.setMarca(marca);
        assertEquals(109200.00f, picape.calcularValorVenda(), 0.01f);
    }

    @Test
    void deveRetornarValorPicapeDaHyundai() {
        Marca marca = new Hyundai();
        Picape picape = new Picape("Santa Cruz",2020,100000.00f);
        picape.setMarca(marca);
        assertEquals(84000.01f, picape.calcularValorVenda(), 0.01f);
    }

    @Test
    void deveRetornarValorPicapeDaFiat() {
        Marca marca = new Fiat();
        Picape  picape = new Picape ("Toro",2017,100000.00f);
        picape.setMarca(marca);
        assertEquals(93500.00f, picape.calcularValorVenda(), 0.01f);
    }
}