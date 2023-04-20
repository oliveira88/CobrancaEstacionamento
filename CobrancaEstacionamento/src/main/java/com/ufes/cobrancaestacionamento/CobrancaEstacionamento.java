/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufes.cobrancaestacionamento;

import com.ufes.cobrancaestacionamento.model.Cliente;
import com.ufes.cobrancaestacionamento.model.Vaga;
import com.ufes.cobrancaestacionamento.model.Veiculo;
import com.ufes.cobrancaestacionamento.services.CalculadoraTarifaService;

/**
 *
 * @author guiro
 */
public class CobrancaEstacionamento {

    public static void main(String[] args) {
        try {
            new CalculadoraTarifaService(new CalculoTarifaEstacionamento())
                    .processar(new Vaga(25, new Cliente("normal"), new Veiculo("carro")));
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
