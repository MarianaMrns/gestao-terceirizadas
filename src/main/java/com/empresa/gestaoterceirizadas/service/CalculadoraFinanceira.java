package com.empresa.gestaoterceirizadas.service;

import com.empresa.gestaoterceirizadas.model.ContratoTerceirizada;
import java.util.List;

public class CalculadoraFinanceira {

    public double calcularDesconto(double valor, double percentual) {
        return valor - (valor * (percentual / 100.0));
    }

    public double calcularCustoTotalContrato(ContratoTerceirizada contrato) {
        return contrato.calcularCustoTotal();
    }

    public double calcularMediaContratos(List<ContratoTerceirizada> contratos) {
        if (contratos.isEmpty()) return 0.0;
        double total = contratos.stream().mapToDouble(ContratoTerceirizada::calcularCustoTotal).sum();
        return total / contratos.size();
    }
}