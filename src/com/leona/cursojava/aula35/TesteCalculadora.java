/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula35;

/**
 *
 * @author leona
 */
public class TesteCalculadora {

    public static void main(String[] args) {

        int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
        System.out.println(fatorialNR);

        int fatorialR = Calculadora.fatorialNaoRecursivo(5);
        System.out.println(fatorialR);
    }
}
