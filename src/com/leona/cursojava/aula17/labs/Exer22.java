package com.leona.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer22 {
 
    public static void main (String [] args){
    
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Entre com o número de CDs:");
        int cds = scan.nextInt();
        
        double preço;
        double soma = 0;
        
        for(int i = 1; i <= cds; i ++){
            
            System.out.println("Informe o valor do cd" + i);
            preço = scan.nextDouble();
            
            soma += preço;
        }
        
       double média = soma / cds;
       
        System.out.println("Média gasta com cada CD" + média);
    }
}
