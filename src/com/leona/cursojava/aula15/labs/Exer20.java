package com.leona.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer20 {

    public static void main (String []args){
    
        Scanner scan = new Scanner (System.in);
         System.out.println("Esteve no local do crime?");
        String resp1 = scan.next();
        
        System.out.println("Telefonou para a vitíma?");
        String resp2 = scan.next();
        
        System.out.println("Mora preto da vitíma?");
        String resp3 = scan.next();
        
        System.out.println("Já trabalhou com a vitíma?");
        String resp4 = scan.next();
        
         System.out.println("Devia para a vitíma?");
        String resp5 = scan.next();
        
        int cont = 0;
        
        if (resp1.equalsIgnoreCase("S")){
           cont ++ ; 
        }
        if (resp2.equalsIgnoreCase("S")){
           cont ++ ; 
        }
        if (resp3.equalsIgnoreCase("S")){
           cont ++ ; 
        }
        if (resp4.equalsIgnoreCase("S")){
           cont ++ ; 
        }
        if (resp5.equalsIgnoreCase("S")){
            cont ++ ;
        }
        switch (cont) {
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassino");
                break;
            case 0:
                System.out.println("Inocente");
                break;
            default:
                break;
        }
    }
}
