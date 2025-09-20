package com.empresa.gestaoterceirizadas.test;

import com.empresa.gestaoterceirizadas.model.ContratoTerceirizada;
import com.empresa.gestaoterceirizadas.model.Terceirizada;
import com.empresa.gestaoterceirizadas.service.CalculadoraFinanceira;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContratoTerceirizadaTest {

    @Test
    public void deveCalcularCustoTotalContrato() {
        Terceirizada empresa = new Terceirizada("Limpeza Rápida", "12345678000199");
        ContratoTerceirizada contrato = new ContratoTerceirizada(empresa, 2000.0, 12);

        assertEquals(24000.0, contrato.calcularCustoTotal(), 0.01);
    }

    @Test
    public void deveCalcularMediaDeContratos() {
        Terceirizada empresa = new Terceirizada("Segurança Forte", "98765432000188");
        ContratoTerceirizada contrato1 = new ContratoTerceirizada(empresa, 1000.0, 6);  // 6000
        ContratoTerceirizada contrato2 = new ContratoTerceirizada(empresa, 2000.0, 3);  // 6000

        CalculadoraFinanceira calc = new CalculadoraFinanceira();
        double media = calc.calcularMediaContratos(Arrays.asList(contrato1, contrato2));

        assertEquals(6000.0, media, 0.01);
    }
}