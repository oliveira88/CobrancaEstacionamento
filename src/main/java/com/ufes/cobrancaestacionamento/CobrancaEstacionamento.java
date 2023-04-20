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
            CalculadoraTarifaService calculadoraTarifaService = new CalculadoraTarifaService();
            Vaga vagaCarro = new Vaga(5, new Cliente("normal"), new Veiculo("carro"));
            Vaga vagaMoto = new Vaga(5, new Cliente("normal"), new Veiculo("moto"));
            Vaga vagaCarroPreferencial = new Vaga(5, new Cliente("preferencial"), new Veiculo("carro"));
            Vaga vagaMotoPreferencial  = new Vaga(5, new Cliente("preferencial"), new Veiculo("moto"));
            calculadoraTarifaService.processar(vagaCarro);
            calculadoraTarifaService.processar(vagaCarroPreferencial);
            calculadoraTarifaService.processar(vagaMoto);
            calculadoraTarifaService.processar(vagaMotoPreferencial);

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
