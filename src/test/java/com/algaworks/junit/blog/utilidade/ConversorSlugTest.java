package com.algaworks.junit.blog.utilidade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

class ConversorSlugTest {

    @Test
    void deveConverterContoComCodigo() {
        try (MockedStatic<GeradorCodigo> mockedStatic = Mockito.mockStatic(GeradorCodigo.class)) {
            mockedStatic.when(GeradorCodigo::gerar).thenReturn("123456");

            String slug = ConversorSlug.converter("olá mundo java");

            Assertions.assertEquals("ola-mundo-java", slug);
        }
    }

}