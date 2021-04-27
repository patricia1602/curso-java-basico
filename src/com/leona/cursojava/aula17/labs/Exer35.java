package com.leona.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer35 {
    
    public static void main (String [] args){
    
        Scanner scan = new Scanner (System.in);
        
         System.out.println("Digite o valor de n");
        int n = scan.nextInt();
        
        for (int i=1, j=1; i<=n; i ++, j+=2){
            
            System.out.println(i + " / " + j + " + " );
        }
    }
}
