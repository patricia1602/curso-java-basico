/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula66;

import com.leona.cursojava.aula61.Contato;

/**
 *
 * @author leona
 */
public class ColetorLixo {

    public static void obterMemoriaUsada() {

        final int MB = 1024 * 1024;

        Runtime runtime = Runtime.getRuntime();//singleton

        System.out.println((runtime.totalMemory() - runtime.freeMemory()) / MB);
    }

    public static void main(String[] args) {

        Contato[] contatos = new Contato[1000000];
        Contato contato;

        for (int i = 0; i < contatos.length; i++) {
            contato = new Contato("Contato" + i, "1234-56789" + i, "contato" + i + "@email.com");
            contatos[i] = contato;
        }

        System.out.println("Contatos criados");

        obterMemoriaUsada();

        contatos = null;

        Runtime.getRuntime().runFinalization();

        Runtime.getRuntime().gc();

        System.out.println("Contatos removidos da memória");

        obterMemoriaUsada();
    }
}
