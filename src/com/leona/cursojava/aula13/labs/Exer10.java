package com.leona.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer10 {
    
   public static void main (String[]args){
       
       Scanner scan= new Scanner(System.in);
       
       System.out.println("Entre com a temperatura em Celsius");
       Double c = scan.nextDouble();
    
       Double f = (c * 1.8) + 32;
    
       System.out.println("a temperatura" + c + "C é igual a:" + f+ "F");
    
         }  
}
