/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula35.labs;

/**
 *
 * @author leona
 */
public class Calculadora {

    public static int fibonacci(int num) {

        if (num < 2) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
