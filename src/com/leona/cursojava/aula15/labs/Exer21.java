package com.leona.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer21 {

    public static void main (String [] args){
    
    Scanner scan = new Scanner (System.in);
         
    System.out.println("Entre com a quantidade de litros vendidos");
    double litros = scan.nextDouble();
    
    System.out.println("Entee com o tipo de combústivel");
    String tipo = scan.next();
    
    double preçGas = 2.5;
    double preçAlc = 1.9;
    int percDesconto = 0;
    double total = 0;
    double totalDesc = 0;
    
    if(tipo.equalsIgnoreCase("a")){
    
            if (litros >= 20){
                percDesconto = 3;
            }else {
                percDesconto = 5;
            }  
            
            total = litros * preçAlc;
            
    }else if (tipo.equalsIgnoreCase("g")){
        
        if (litros >= 20){
            percDesconto = 4;
           }else {
            percDesconto = 6;
        }
            total = litros * preçGas;
    }
            totalDesc = (total / 100)* percDesconto;
            
            double preçoApagar = total - totalDesc;  
            
            System.out.println("Valor a ser se pago:" + preçoApagar);
    }
}
