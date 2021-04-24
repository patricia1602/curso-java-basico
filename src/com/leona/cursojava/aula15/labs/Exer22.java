package com.leona.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer22 {

    public static void main (String [] args){
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Entre com a quantidade (Kg) de morango:");
    double qtdMorango = scan.nextDouble();
    
    System.out.println("Entre com a quantidade (Kg) de maçã:");
    double qtdMaçã = scan.nextDouble();
    
    double preçoMorango = 0;
    if (qtdMorango <= 5){
        preçoMorango = 2.5;
    }else {
        preçoMorango = 2.2;
    }
    double preçoMaçã = 0;
    if (qtdMaçã <= 5){
        preçoMaçã = 1.8;
    }else {
        preçoMaçã = 1.5;
        }
    double preçoTotalMorango = qtdMorango * preçoMorango;
    double preçoTotalMaçã = qtdMaçã * preçoMaçã;
    
    double preçoParcial = preçoMorango + preçoMaçã;
    double preçoTotal = preçoParcial;
    
    if ((qtdMorango + qtdMaçã >8) || preçoParcial >25){
        preçoTotal = preçoParcial -((preçoParcial / 100) * 10);
    }
    System.out.println("Preço total = " + preçoTotal);
    }
}