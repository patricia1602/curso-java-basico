package com.leona.cursojava.aula74.labs;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadSemaforo implements Runnable {

    public CorSemaforo cor;
    private boolean parar;

    public ThreadSemaforo() {
        this.cor = CorSemaforo.VERMELHO;

        this.parar = false;

        new Thread(this).start();
    }

    @Override
    public void run() {

        while (!parar) {
            try {
                switch (this.cor) {
                    case VERMELHO:
                        Thread.sleep(2000);
                        break;
                    case AMARELO:
                        Thread.sleep(300);
                        break;
                    case VERDE:
                        Thread.sleep(1000);
                        break;
                    default:
                        break;
                }
                this.mudarCor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized void mudarCor() {

        switch (this.cor) {
            case VERMELHO:
                this.cor = CorSemaforo.VERDE;
                break;
            case AMARELO:
                this.cor = CorSemaforo.VERMELHO;
                break;
            case VERDE:
                this.cor = CorSemaforo.AMARELO;
                break;
            default:
                break;

        }
    }

    public CorSemaforo getCor() {
        return cor;
    }
}
