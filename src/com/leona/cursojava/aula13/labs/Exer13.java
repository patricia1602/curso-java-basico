package com.leona.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer13 {
    
    public static void main (String [] args){
    
        Scanner scan=new Scanner (System.in);
        
        System.out.println("Entre com o valor/hora");
        double valorHora= scan.nextDouble();
        
        System.out.println("Entre com a quantidade de horas trabalhadas no mês");
        double horas= scan.nextDouble();
        
        double salárioBruto= valorHora * horas;
        double inss = (salárioBruto /100)* 8;
        double sindicato = (salárioBruto / 100) * 5;
        double ir = (salárioBruto / 100) *11;
        double totalDescontos = inss + sindicato + ir;
        double salárioLiquído = salárioBruto - totalDescontos;

        System.out.println("O salário bruto é:" + salárioBruto);
        System.out.println("Inss:" + inss);
        System.out.println("Sindicato:" + sindicato);
        System.out.println("Total descontos:" + totalDescontos );
        System.out.println("Salário liquído:" + salárioLiquído);
        
        
    }
    
}
    
