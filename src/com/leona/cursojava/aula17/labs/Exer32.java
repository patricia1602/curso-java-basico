package com.leona.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer32 {
    
    public static void main (String [] args){
    
        Scanner scan = new Scanner (System.in);
        
        boolean nãoTerminar = true;
        int cod, qtd;
        
        do{
        
             System.out.println("Digite o código e a quantidade. Digite 00 para sair.");
             cod = scan.nextInt();
             qtd = scan.nextInt();
             double total = 0 ;
             String output = "";
             
             if (cod == 0 && qtd == 0){
                 nãoTerminar = false;
                output += "Total a pagar = " + total;
                  }else{
                 
                 if (cod == 100){
                     output +="Cachorro Quente -> 1,20 * " + qtd;
                     output += " = " + (1.20 * qtd) + "\n";
                     total += 1.20 * qtd;
                }else if (cod == 101){
                 output +="Bauru Simples -> 1,30 * " + qtd;
                     output += " = " + (1.30 * qtd) + "\n";
                     total += 1.30 * qtd;
                 }else if (cod == 102){
                 output +="Bauru com ovo -> 1,50 * " + qtd;
                     output += " = " + (1.50 * qtd) + "\n";
                     total += 1.50 * qtd;
                 }else if (cod == 103){
                 output +="Hambúrguer -> 1,20 * " + qtd;
                     output += " = " + (1.20 * qtd) + "\n";
                     total += 1.20 * qtd;
                 }else if (cod == 104){
                 output +="Cheeseburguer -> 1,30 * " + qtd;
                     output += " = " + (1.30 * qtd) + "\n";
                     total += 1.30 * qtd;
                 }else if (cod == 105){
                 output +="Refrigerante -> 1,0 * " + qtd;
                     output += " = " + (1.00 * qtd) + "\n";
                     total += 1.00 * qtd;
                 }
             }
        }while (nãoTerminar);
        boolean output = true;
        
         System.out.println(output);
    }
}