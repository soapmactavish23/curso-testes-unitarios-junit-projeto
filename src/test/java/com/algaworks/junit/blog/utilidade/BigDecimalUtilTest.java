package com.algaworks.junit.blog.utilidade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;

class BigDecimalUtilTest {

    @ParameterizedTest
    @CsvSource({
            "10.00,10",
            "9.00, 9.00"
    })
    void iguais(BigDecimal x, BigDecimal y) {
        Assertions.assertTrue(BigDecimalUtil.iguais(x, y));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/numeros.csv")
    void diferentes(BigDecimal x, BigDecimal y) {
        Assertions.assertFalse(BigDecimalUtil.iguais(x, y));
    }




}