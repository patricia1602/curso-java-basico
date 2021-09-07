/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula52;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leona
 */
public class UsandoMinhaException {

    public static void main(String[] args) {

        try {
            teste();
        } catch (DivisaoNaoExata e) {
            e.printStackTrace();
        }
    }

    public static void teste() throws DivisaoNaoExata {
        int[] numeros = {4, 8, 5, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 8, 0, 2, 4};

        for (int i = 0; i < numeros.length; i++) {
            try {
                if (numeros[i] % 2 != 0) {
                    //lancar  a expection aqui
                    throw new DivisaoNaoExata(numeros[i], denom[i]);
                }
                System.out.println(numeros[i] + "/" + denom[i] + "=" + (numeros[i] / denom[i]));
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Aconteceu um erro");
                e.printStackTrace();
            }
        }
    }
}
