/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula64;

/**
 *
 * @author leona
 */
public class Anonima {

    public void imprimeTexto() {

        System.out.println("qualquer texto");

    }

    public static void main(String[] args) {

        Anonima anonima = new Anonima() {
            public void imprimeTexto() {
                System.out.println("qualquer texto que foi sobrescrito");
            }
        };

        anonima.imprimeTexto();

        //usando interface
        Texto texto = new Texto() {
            @Override
            public void imprimeTexto() {
                System.out.println("qualquer texto - interface");
            }
        };

        texto.imprimeTexto();
    }
}
