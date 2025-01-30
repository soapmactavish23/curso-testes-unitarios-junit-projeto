package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import java.time.Duration;

class SimuladorEsperaTest {

    @Test
    //@Disabled("Não é mais aplicavel")
    @EnabledIfEnvironmentVariable(named = "ENV", matches = "DEV")
    void deveEsperarENaoDarTimeout() {
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(1), () -> SimuladorEspera.esperar(Duration.ofMillis(10)));
    }

}