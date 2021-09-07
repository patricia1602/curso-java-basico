/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula52;

/**
 *
 * @author leona
 */
public class DivisaoNaoExata extends Exception{
    
    private int num;
    private int den;

    public DivisaoNaoExata(int num, int den) {
        this.num = num;
        this.den = den;
    }

    @Override
    public String toString() {
        return "Resultado de " + num + "/" + den + "nao e um inteiro!";
    }  
}
