/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula60;

/**
 *
 * @author leona
 */
public class Teste {

    public static void main(String[] args) {

        EscopoVariaveis escopo = new EscopoVariaveis();
        escopo.setValor(10);

        System.out.println(escopo.getValor());//10

        System.out.println(escopo.calcularValor(20));//20 ou 30?

        System.out.println(escopo.getValor());//10 ou 20?

        System.out.println(escopo.teste());//4 ou 9?
        System.out.println(escopo.getValor());
    }
}
