/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.cobrancaestacionamento.model;

/**
 *
 * @author guiro
 */
public class Veiculo {

    private final String tipo;

    public Veiculo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Veiculo{" + tipo + "}";
    }
    
}
