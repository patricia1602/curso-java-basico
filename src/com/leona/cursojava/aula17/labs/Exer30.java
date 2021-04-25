package com.leona.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer30 {
    
    public static void main (String [] args){
    
        Scanner scan = new Scanner (System.in);
        
         System.out.println("Entre com um número para gerar a tabuada:");
             int num = scan.nextInt();
             
             boolean invalido = true;
             int numFinal, numInício;
             
             do{
                 
             System.out.println("Entre com o início da tabuada");
             numInício= scan.nextInt();
             
             System.out.println("Entre com o final da tabuada");
             numFinal = scan.nextInt();
             
             if (numFinal > numInício){
                 invalido = false;   
             }
                 
             }while (invalido);
             
              System.out.println("Tabuada de" + num + ":");
              System.out.println("Começar por:" + numInício);
              System.out.println("Terminar por:" + numFinal);
              System.out.println( );        
              
              for (int i=numInício; i<=numFinal; i++){
               System.out.println(num + "x" + i + " = " + (num*i));
              }
    }
}
