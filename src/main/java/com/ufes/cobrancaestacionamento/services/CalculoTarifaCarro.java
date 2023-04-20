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
public class CalculoTarifaCarro implements ICalculoTarifa  {
    @Override
    public double calcular(Vaga vaga) {
        double tarifaTotal = 0.0;
        if (vaga.getHorasEstacionadas() < 5) {
            tarifaTotal = 5.0;
        } else if (vaga.getHorasEstacionadas() < 13) {
            tarifaTotal = 20.0;
        } else if (vaga.getHorasEstacionadas() < 24) {
            tarifaTotal = 40.0;
        }
        if (vaga.getCliente().getTipo().equalsIgnoreCase("preferencial")) {
            tarifaTotal = tarifaTotal * 0.7;
        }
        return tarifaTotal;
    }

    @Override
    public boolean seAplica(Veiculo veiculo) {
        return "carro".equalsIgnoreCase(veiculo.getTipo());
    }
}
