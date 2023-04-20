/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.cobrancaestacionamento.services;

import com.ufes.cobrancaestacionamento.model.Vaga;
import java.util.ArrayList;

/**
 *
 * @author guiro
 */
public class CalculadoraTarifaService {

    private final ArrayList<ICalculoTarifa> calculoTarifas;

    public CalculadoraTarifaService() {
        this.calculoTarifas = new ArrayList();
        this.calculoTarifas.add(new CalculoTarifaCarro());
        this.calculoTarifas.add(new CalculoTarifaMoto());
    }

    public void processar(Vaga vaga) {
        double resultado = 0.0;
        for (ICalculoTarifa metodo : this.calculoTarifas) {
            if (metodo.seAplica(vaga.getVeiculo())) {
                resultado = metodo.calcular(vaga);
                break;
            }
        }
        System.out.printf("A tarifa total do %s com %s é de %.1f\n", vaga.getVeiculo(), vaga.getCliente(), resultado);
    }
}
