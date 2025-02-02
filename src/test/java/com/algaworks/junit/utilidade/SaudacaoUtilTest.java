package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaudacaoUtilTest {

    @Test
    public void saudar() {
        String saudacao = SaudacaoUtil.saudar(9);
        assertEquals("Bom dia", saudacao);
    }

    @Test
    public void deveLancarException() {
        int horaInvalida = -10;

        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
            SaudacaoUtil.saudar(-10);
        });

        assertEquals("Hora inválida", illegalArgumentException.getMessage());
    }

    @Test
    public void naoDeveLancarException() {
        assertDoesNotThrow(() -> SaudacaoUtil.saudar(0));
    }

}