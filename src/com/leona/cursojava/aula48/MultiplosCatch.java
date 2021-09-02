/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula48;

/**
 *
 * @author leona
 */
public class MultiplosCatch {

    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denom[i] + "=" + (numeros[i] / denom[i]));
            } catch (ArithmeticException e1) {
                System.out.println("Erro ao dividir por zero");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posicao do array invalida");
            }
        }
    }
}
