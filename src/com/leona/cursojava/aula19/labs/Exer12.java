package com.leona.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer12 {
   
        public static void main(String [] args){
        
            Scanner scan = new Scanner (System.in);
            
            int[] vetorA= new int[10];
            
            for(int i=0; i<vetorA.length; i++){
                System.out.print("Entre com a posiçao" + i);
                vetorA[i]= scan.nextInt();
            }
            
            int soma = 0;
            for(int i=0; i<vetorA.length; i++){
                soma += vetorA[i];
            }
            
            System.out.print("Vetor A = ");
            for(int i=0; i<vetorA.length; i++){
                System.out.print(vetorA[i] + " ");
            }
            System.out.println();
            
            System.out.println("Soma: " + soma);
       }
}
