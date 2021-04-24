package com.leona.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer08 {
    
        public static void main(String [] args ){

        Scanner scan = new Scanner (System.in);
        
        System.out.println("Entre com o primeiro preço:");
        double preço1 = scan.nextDouble();
        
        System.out.println("Entre com o segundo preço:");
        double preço2 = scan.nextDouble();
        
        System.out.println("Entre com o terceiro preço:");
        double preço3 = scan.nextDouble();
    
        if (preço1 <= preço2 && preço1 <= preço3){
            System.out.println("Compre o produto 1:");
        }else if(preço2 <= preço3 && preço2 <= preço3){
            System.out.println("Compre o produto 2:");
        }else if (preço3 <= preço1 && preço3 <= preço2){
            System.out.println("compre o produto 3");
            
          }
        
        }
}
