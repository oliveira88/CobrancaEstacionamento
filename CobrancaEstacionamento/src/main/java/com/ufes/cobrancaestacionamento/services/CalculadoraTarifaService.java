/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.cobrancaestacionamento.services;

import com.ufes.cobrancaestacionamento.ICalculoTarifa;
import com.ufes.cobrancaestacionamento.model.Vaga;

/**
 *
 * @author guiro
 */
public class CalculadoraTarifaService {
    private final ICalculoTarifa calculoTarifa;

    public CalculadoraTarifaService(ICalculoTarifa calculoTarifa) {
        this.calculoTarifa = calculoTarifa;
    }
    
    public void processar(Vaga vaga) {
        double resultado = calculoTarifa.calcular(vaga);
        System.out.println("A tarifa total é de: "+ resultado);
    }
}
