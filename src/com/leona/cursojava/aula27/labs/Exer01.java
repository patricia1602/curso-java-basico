package com.leona.cursojava.aula27.labs;

public class Exer01 {

    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.ligar();

        lampada.mostrarEstado();

        lampada.desligar();

        lampada.mostrarEstado();

        lampada.mudarEstado();

        lampada.mostrarEstado();

        if (lampada.ligada) {
            System.out.println("Lampada esta ligada");
        } else {
            System.out.println("Lampada esta desligada");
        }

        lampada.desligar();

        if (lampada.ligada) {
            System.out.println("Lampada esta ligada");
        } else {
            System.out.println("Lampada esta desligada");
        }
    }
}
