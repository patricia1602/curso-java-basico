/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula17.labs;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Exer30 {
    
    public static void main (String [] args){
    
        Scanner scan = new Scanner (System.in);
        
         System.out.println("Entre com um número para gerar a tabuada:");
             int num = scan.nextInt();
             
             boolean invalido = false;
             int numFinal, numInício;
             
             do{
                 
             System.out.println("Entre com o início da tabuada");
             numInício= scan.nextInt();
             
             System.out.println("Entre com o final da tabuada");
             numFinal = scan.nextInt();
             
             if (numFinal < numInício){
                 invalido =true;
                 
             }
                 
             }while (!invalido);
             
              System.out.println("Tabuada de" + num + ":");
              System.out.println("");
                      
              
              for (int i=1; i<=10; i++){
               System.out.println(num + "x" + i + " = " + (num*i));
              }
    }
}
