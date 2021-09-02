/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula47;

/**
 *
 * @author leona
 */
public class Excecao {

    public static void main(String[] args) {
        try {
            int[] vetor = new int[4];

            System.out.println("Antes da exception");

            vetor[4] = 1;

            System.out.println("Esse texto nao sera impresso");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Excecao ao acesar um indice do vetor que nao existe");
        }
        System.out.println("Esse texto sera impresso apos a exception");
    }
}
