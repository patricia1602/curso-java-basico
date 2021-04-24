package com.leona.cursojava.aula15.labs;

import java.util.Scanner;


public class Exer11 {
    
    public static void main (String [] args){
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println ("Digite o seu salário:");
    double salário = scan.nextDouble();
    
    int percentual = 0;
    if (salário <= 280){
        percentual = 20;
         } else if (salário < 280 && salário > 700){
               percentual =15;
    }else if (salário >= 700 && salário < 1500){
               percentual =10;
    }else if (salário >= 1500){
        percentual = 5;
       }
     double aumento = (salário / 100) * percentual;
     double salárioAjustado = salário + aumento;
     
     System.out .println("Salario:" + salário);
      System.out .println("Percentual:" + percentual);
       System.out .println("Aumento:" + aumento);
        System.out .println("Salarioajustado:" + salárioAjustado);
      
          }
    }

