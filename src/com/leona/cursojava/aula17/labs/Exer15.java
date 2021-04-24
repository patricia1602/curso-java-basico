package com.leona.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer15 {
 
    public static void main (String [] args){
    
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Entre com um n-ésimo do termo da série fibonacci:");
        int n = scan.nextInt();
        
        int primeiro = 1;
        int segundo = 1;
        int proxímo ;
        
        System.out.println(primeiro);
        System.out.println(segundo);
        
        //1,1,2,3,5
        //primeiro = 1
        //segundo = 2
        //proxímo = 3
        
        for (int i =3; i<=n; i ++){
        
            proxímo = primeiro + segundo;
            primeiro = segundo;
            segundo = proxímo;
        
            System.out.println(proxímo);
        }
    }
}