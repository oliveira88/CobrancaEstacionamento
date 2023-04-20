/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.cobrancaestacionamento.services;

import com.ufes.cobrancaestacionamento.model.Vaga;
import com.ufes.cobrancaestacionamento.model.Veiculo;

/**
 *
 * @author guiro
 */
public class CalculoTarifaMoto implements ICalculoTarifa{
    @Override
    public double calcular(Vaga vaga) {
        double tarifaTotal = 0.0;
         if (vaga.getHorasEstacionadas() < 5) {
            tarifaTotal = 2.5;
        } else if (vaga.getHorasEstacionadas() < 12) {
            tarifaTotal = 10.0;
        } else if (vaga.getHorasEstacionadas() < 24) {
            tarifaTotal = 20.0;
        }
        if (vaga.isClientePreferencial()) {
            tarifaTotal = tarifaTotal * 0.7;
        }
        return tarifaTotal;
    }

    @Override
    public boolean seAplica(Veiculo veiculo) {
        return "moto".equalsIgnoreCase(veiculo.getTipo());
    }
}
