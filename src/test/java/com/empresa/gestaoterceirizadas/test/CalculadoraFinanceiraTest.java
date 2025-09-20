package com.empresa.gestaoterceirizadas.test;

import com.empresa.gestaoterceirizadas.service.CalculadoraFinanceira;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraFinanceiraTest {

    @Test
    public void deveAplicarDescontoCorretamente() {
        CalculadoraFinanceira calc = new CalculadoraFinanceira();
        double valorComDesconto = calc.calcularDesconto(1000.0, 10.0);
        assertEquals(900.0, valorComDesconto, 0.01);
    }
}