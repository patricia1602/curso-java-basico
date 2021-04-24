package com.leona.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {
    
    public static void main (String[]args){
        
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Entre com o valor/hora");
        double valorHora= scan.nextDouble();
        
        System.out.println("Entre com a quantidade de horas tabalhadas no mês");
        double horas= scan.nextDouble();
        
        double salario= valorHora * horas;
        
        System.out.println("O salario é de:" + salario);
    }
}
