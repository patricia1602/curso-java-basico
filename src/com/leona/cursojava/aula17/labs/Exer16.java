package com.leona.cursojava.aula17.labs;

import java.util.Scanner;


public class Exer16 {
    
    public static void main (String [] args){
    
        //Scanner scan = new Scanner (System.in);
     
        int primeiro = 1;
        int segundo = 1;
        int proxímo = 0 ;
        
        System.out.println(primeiro);
        System.out.println(segundo);
        
        while (proxímo <= 500){
            
          proxímo = primeiro + segundo;
            primeiro = segundo;
            segundo = proxímo;
        
            System.out.println(proxímo);
        }
       
    }
}
