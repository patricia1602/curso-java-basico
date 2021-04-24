package com.leona.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer09 {

    public static void main (String[]args){
    
    Scanner scan= new Scanner(System.in);
    
    System.out.println("Entre com a temperatura em Farenheit");
    Double f= scan.nextDouble();
    
    Double c= (5 * (f -32)/9);
    
    System.out.println("a temperatura" + f + "F é igual a:" + c+ "C");
    
    }
               
  }