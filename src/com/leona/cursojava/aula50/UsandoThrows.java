/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula50;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class UsandoThrows {

    public static void main(String[] args) {

        System.out.println("Entre com um numero decimal");
        try {
            double num = leNumero();
            System.out.println("Voce digitou" + num);
        } catch (Exception e) {
            System.out.println("Entrada invalida");
            e.printStackTrace();
        }
    }

    public static double leNumero() throws Exception {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
}
