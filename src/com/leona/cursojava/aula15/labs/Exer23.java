package com.leona.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer23 {
    
    public static void main ( String [] args){
    
        Scanner scan= new Scanner (System.in);
        
        System.out.println("Entre com o tipo da carne:");
        System.out.println("1 - file duplo");
        System.out.println("2 - alcatra");
        System.out.println("3 - picanha");
        int tipo = scan.nextInt();
        
        System.out.println("Entre com a quantidade (Kg)");
        double qtd = scan.nextDouble();
        
        double preçoKg = 0;
        
        if (tipo == 1){
            
            System.out.println(qtd +"Kg - file duplo");
        }
             if (qtd <5){
                preçoKg = 4.9;
            }else {
                preçoKg = 5.8;
        }
            
            if (tipo == 2){

            System.out.println(qtd +"Kg - alcatra");
        }        
            if (qtd <5){
                preçoKg = 5.9;
            }else {
                preçoKg = 6.8;
        }
            
          if (tipo == 3){
              
            System.out.println(qtd +"Kg - picanha");
        }
            if (qtd <5){
                preçoKg = 6.9;
            }else {
                preçoKg = 7.8;  
        }
          double total = qtd * preçoKg;
          System.out.println(qtd + "Kg *" + preçoKg + " = " + total);
          
          System.out.println("Compra no cartão? digite 1 para sim:");
          int cartão = scan.nextInt();
          
          if (cartão ==1){
            double desconto = (total / 100)* 5;
            System.out.println("Desconto de :" + desconto);
            System.out.println("Valor a pagar:" + (total - desconto));
          }else{
              System.out.println("Valor a pagar:" + total);
    
          }
    }
}
          
          


          