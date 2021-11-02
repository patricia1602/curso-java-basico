/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula67;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leona
 */
public class MinhaThread extends Thread {

    private String nome;
    private int tempo;

    public MinhaThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start();
    }

    public void run() {

        try {

            for (int i = 0; i < 6; i++) {
                System.out.println(nome + "Contador" + i);
                Thread.sleep(tempo);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(nome + "terminou a execuçao");
    }
}
