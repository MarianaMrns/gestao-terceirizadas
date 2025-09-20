package com.empresa.gestaoterceirizadas.model;

public class ContratoTerceirizada {
    private Terceirizada empresa;
    private double valorMensal;
    private int duracaoMeses;

    public ContratoTerceirizada(Terceirizada empresa, double valorMensal, int duracaoMeses) {
        this.empresa = empresa;
        this.valorMensal = valorMensal;
        this.duracaoMeses = duracaoMeses;
    }

    public Terceirizada getEmpresa() {
        return empresa;
    }

    public double getValorMensal() {
        return valorMensal;
    }

    public int getDuracaoMeses() {
        return duracaoMeses;
    }

    public double calcularCustoTotal() {
        return valorMensal * duracaoMeses;
    }
}