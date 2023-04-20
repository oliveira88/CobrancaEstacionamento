/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.cobrancaestacionamento;

import com.ufes.cobrancaestacionamento.model.Vaga;

/**
 *
 * @author guiro
 */
public class CalculoTarifaEstacionamento implements ICalculoTarifa {

    @Override
    public double calcular(Vaga vaga) {
        double tarifaTotal = 0.0;
        switch (vaga.getVeiculo().getTipo()) {
            case "carro" -> {
                if (vaga.getHorasEstacionadas() < 5) {
                    tarifaTotal = 5.0;
                } else if (vaga.getHorasEstacionadas() < 13) {
                    tarifaTotal = 20.0;
                } else if (vaga.getHorasEstacionadas() < 24) {
                    tarifaTotal = 40.0;
                }
            }
            case "moto" -> {
                if (vaga.getHorasEstacionadas() < 5) {
                    tarifaTotal = 2.5;
                } else if (vaga.getHorasEstacionadas() < 12) {
                    tarifaTotal = 10.0;
                } else if (vaga.getHorasEstacionadas() < 24) {
                    tarifaTotal = 20.0;
                }
            }
        }
        if (vaga.getCliente().getTipo().equals("preferencial")) {
            tarifaTotal = tarifaTotal * 0.7;
        }
        return tarifaTotal;
    }

}
