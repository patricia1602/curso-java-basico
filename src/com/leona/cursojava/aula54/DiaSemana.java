/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula54;

/**
 *
 * @author leona
 */
public enum DiaSemana {
    
    SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4),
    SEXTA(5), SABADO(6), DOMINGO(7);
    
   private int valor;

    private DiaSemana(int valor) {
        this.valor = valor;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }
   
}
