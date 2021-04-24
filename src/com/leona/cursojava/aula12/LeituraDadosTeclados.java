package com.leona.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclados {
 
    public static void main(String[]args){
    
        Scanner scan = new Scanner(System.in);
        
       /* System.out.println("Digite Seu Nome Completo:");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é:"+nomeCompleto);
    
        System.out.println("Digite Seu primeiro Nome:");    
        String primeiroNome = scan.nextLine();
        System.out.println("seu primeiro Nome é:" + primeiroNome);
     
        System.out.println("digite a sua idade");
        int idade = scan.nextInt();
        System.out.println("Sua idade é :" + idade);
        
         System.out.println("digite a sua altura");
        double altura = scan.nextDouble();
        System.out.println("Sua altura é :" + altura);*/
        
        System.out.println("Digite seu primeiro nome,idade,quantidade de filhos, altura e se tem bichinho de estimaçao:");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.hasNextBoolean();
        
        System.out.println("Você digitou os seguintes valores:");
        System.out.println("primeiro Nome:" + primeiroNome);
        System.out.println("Idade:"+ idade);
        System.out.println("Quantidade de filhos:"+ qtdFilhos);  
        System.out.println("Atura:"+ altura);  
        System.out.println("Tem bichinho de estimaçao?" + temPet);
        
        
    
    } 
    

}
