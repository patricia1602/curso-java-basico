package com.leona.cursojava.aula74.labs;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SimuladorSemaforo {

    public static void main(String[] args) {

        ThreadSemaforo semaforo = new ThreadSemaforo();

        for (int i = 0; i < 10; i++) {

            System.out.println(semaforo.getCor());
            semaforo.esperaCorMudar();
        }
        semaforo.deligarSemaforo();
    }
}
