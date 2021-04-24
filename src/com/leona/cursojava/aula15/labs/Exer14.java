package com.leona.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer14 {
    
    public static void main (String [] args){
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Entre com a primeira nota:");
    double nota1 = scan.nextDouble();
    
    System.out.println("Entre com a segunda nota");
    double nota2 = scan.nextDouble();
    
    double média = (nota1 + nota2) / 2;
    
    String aproveitamento = "";
    if (média >= 9 && média <= 10){
        aproveitamento = "A";
    }else if (média >=  7.5 && média <= 9){
        aproveitamento = "B";
    }else if (média >= 6 && média <= 7.5){
        aproveitamento = "C";
    }else if (média >= 4 && média <= 6){
        aproveitamento = "D";    
    }else if (média >= 0 && média <= 4){
        aproveitamento = "E";
    }
    
    System.out.println("Nota 1:" + nota1);
    System.out.println("Nota 2:" +nota2);
    System.out.println("Média:" + média);
    System.out.println("Conceito:" + aproveitamento);
    
    switch (aproveitamento){
        case "A":
        case "B":
        case "C": System.out.println("Aprovado"); break;
        case "D":
        case "E": System.out.println("Reprovado"); break;
    }
  }
}