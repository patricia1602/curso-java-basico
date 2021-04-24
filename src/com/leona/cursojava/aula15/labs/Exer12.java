package com.leona.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer12 {
    
    public static void main (String [] args){
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Entre com o valor/hora:");
    double valorHora = scan.nextDouble();
    
     System.out.println("Entre com as horas trabalhadas no mês:");
    double qtdHoras = scan.nextDouble();
    
    double salárioBruto = valorHora * qtdHoras;
    
    int percentualIR = 0;
    if (salárioBruto <= 900){
        percentualIR = 0;
    }else if (salárioBruto > 900 && salárioBruto >= 1500){
        percentualIR = 5;
    }else if (salárioBruto > 1500 && salárioBruto >= 2500){
        percentualIR = 10;
    }else if (salárioBruto > 2500 ){
        percentualIR = 20;
    }
    double IR = (salárioBruto / 100) * 20;
    double INSS = (salárioBruto / 100) * 10;
    double FGTS = (salárioBruto /100) *11;
    double totalDescontos = IR + INSS;
    double salárioLiquído = salárioBruto - totalDescontos;
    
    System.out.println ("Salário Bruto:(" + valorHora + " * " + qtdHoras + "):" + salárioBruto);
    System.out.println(" (-) IR (" + percentualIR + "20 %):" + IR);
    System.out.println("(-)INSS (10%)" + INSS);
    System.out.println("(-)FGTS (11%)" + FGTS);
    System.out.println("Total de descontos" + totalDescontos);
    System.out.println("Salário Liquído" + salárioLiquído);
    
    }
}

