package com.empresa.gestaoterceirizadas.model;

import java.util.ArrayList;
import java.util.List;

public class Terceirizada {
    private String nome;
    private String cnpj;
    private List<ContratoTerceirizada> contratos = new ArrayList<>();

    public Terceirizada(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public List<ContratoTerceirizada> getContratos() {
        return contratos;
    }

    public void adicionarContrato(ContratoTerceirizada contrato) {
        contratos.add(contrato);
    }

    public double calcularValorTotalContratos() {
        return contratos.stream()
                .mapToDouble(ContratoTerceirizada::calcularCustoTotal)
                .sum();
    }
}