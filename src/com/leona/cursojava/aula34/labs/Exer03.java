/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula34.labs;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Exer03 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num;
        
        do {
            
            System.out.println("Entre com um numero positivo");
            num = scan.nextInt();
            
            if (num < 0) {
                System.out.println("Numero invalido, entre novamente");
            }
            
        } while (num < 0);
        
        System.out.println(Calculadora.fatorial(num));
    }
}
