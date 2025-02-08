package com.algaworks.junit.blog.utilidade;

import java.math.BigDecimal;

public class BigDecimalUtil {

    public static boolean iguais(BigDecimal x, BigDecimal y) {
        return x.compareTo(y) == 0;
    }

}
