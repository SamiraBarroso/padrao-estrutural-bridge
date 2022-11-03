package ufjf.br;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SUVTest {

    @Test
    void deveRetornarValorPicapeDaChery() {
        Marca marca = new Chery();
        SUV suv = new SUV("Tiggo 8",2019,95000.00f);
        suv.setMarca(marca);
        assertEquals(83979.99f, suv.calcularValorVenda(), 0.01f);
    }

    @Test
    void deveRetornarValorPicapeDaHyundai() {
        Marca marca = new Hyundai();
        SUV suv = new SUV("Creta",2020,90000.00f);
        suv.setMarca(marca);
        assertEquals(73440.01f, suv.calcularValorVenda(), 0.01f);
    }

    @Test
    void deveRetornarValorPicapeDaFiat() {
        Marca marca = new Fiat();
        SUV  suv = new SUV ("Pulse",2017,89000.00f);
        suv.setMarca(marca);
        assertEquals(66572.00f, suv.calcularValorVenda(), 0.01f);
    }

}