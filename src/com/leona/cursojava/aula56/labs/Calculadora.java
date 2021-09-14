/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula56.labs;

/**
 *
 * @author leona
 */
public class Calculadora {

    enum Operacao {
        SOMAR("+") {
            @Override
            public double executarOperacao(double x, double y) {
                return x + y;
            }
        }, SUBTRAIR("-") {
            @Override
            public double executarOperacao(double x, double y) {
                return x - y;
            }
        }, MULTIPLICAR("*") {
            @Override
            public double executarOperacao(double x, double y) {
                return x * y;
            }
        }, DIVIDIR("/") {
            @Override
            public double executarOperacao(double x, double y) {
                return x / y;
            }
        };

        private String simbolo;

        private Operacao(String simbolo) {
            this.simbolo = simbolo;
        }

        public abstract double executarOperacao(double x, double y);

        public String toString() {
            return this.simbolo;
        }
    }

    public static void main(String[] args) {

        double x = 2.0;
        double y = 3.0;

        for (Operacao op : Operacao.values()) {
            System.out.println(x + " ");
            System.out.println(op.toString() + " ");
            System.out.println(y + " = ");
            System.out.println(op.executarOperacao(x, y));

        }

    }
}
