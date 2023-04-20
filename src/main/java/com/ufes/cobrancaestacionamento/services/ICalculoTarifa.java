/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ufes.cobrancaestacionamento.services;

import com.ufes.cobrancaestacionamento.model.Vaga;
import com.ufes.cobrancaestacionamento.model.Veiculo;

/**
 *
 * @author guiro
 */
public interface ICalculoTarifa {
    public double calcular(Vaga vaga);
    public boolean seAplica(Veiculo veiculo);
}
