package com.leona.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer20 {
   
    public static void main (String [] args){
    
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Entre com a quantidade de idades");
        int idades = scan.nextInt();
        
        int idade ;
        int soma = 0;
        
        for(int i = 0; i<idades; i ++){
        
            System.out.println("Entre com a idade da pessoa" + (i+ 1));
            idade = scan.nextInt();
            
        soma += idade;    
        }
        
        double média = soma / idades;
        
        System.out.println("Média de idade:" + média);
        
        if (média >= 0 && média <= 25){
            System.out.println("jovem");
        }else if (média >= 26 && média <= 60){
            System.out.println("adulto");
        }else if(média >60){
            System.out.println("idosa");
        }
    }
            
}

