/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.cobrancaestacionamento.model;


/**
 *
 * @author guiro
 */
public class Vaga {
    private int horasEstacionadas;
    private Cliente cliente;
    private Veiculo veiculo;

    public Vaga(int horasEstacionadas, Cliente cliente, Veiculo veiculo) throws Exception {
        if(horasEstacionadas < 1 || horasEstacionadas > 24) {
            throw new Exception("Informe horas entre 1 e 24");
        } else {
            this.horasEstacionadas = horasEstacionadas;
        }
        this.cliente = cliente;
        this.veiculo = veiculo;
    }

    public int getHorasEstacionadas() {
        return horasEstacionadas;
    }

    public void setHorasEstacionadas(int horasEstacionadas) throws Exception {
        if(horasEstacionadas < 1 || horasEstacionadas > 24) throw new Exception("Informe horas entre 1 e 24");
        this.horasEstacionadas = horasEstacionadas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
