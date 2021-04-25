package com.leona.cursojava.aula17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer31 {

    public static void main (String [] args){
    
        Scanner scan = new Scanner (System.in);
        
       double salário = 1000; //95
       
       double percentual = 1.5; //96
       
       salário += (salário/100) * percentual; //96
       
       DecimalFormat format = new DecimalFormat ("###,###.##");
       
       for (int i=1997; i<=2015; i++){
           
           percentual *= 2;
           
        salário += (salário/100) * percentual; //96
           
        System.out.println(i + " = " + format.format (salário) + " - " + percentual + " % ");
       }
       
    }
}
