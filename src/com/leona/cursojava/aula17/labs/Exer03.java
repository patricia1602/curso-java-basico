package com.leona.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer03 {

    public static void main (String [] args){
    
        Scanner scan = new Scanner (System.in);
        String nome, sexo, estadoCivil;
        int idade;
        double salário;
        
        boolean infoValida = false;
      
          do {
        
            System.out.println("Entre com o nome:");
            
            nome = scan.next ();
            
            if (nome.length()>=3){
                infoValida = true;
            }else{
                System.out.println("Nome precisa no minímo de 3 caracteres.");
            }
        }while (!infoValida);
        do {
        
            System.out.println("Entre com a idade:");
            
            idade = scan.nextInt();
            
            if (idade >=0 && idade <=150){
                infoValida = true;
            }else{
                System.out.println("Idade precisa ser entre 0 e 150.");
            }
        }while (!infoValida);
        
        
        infoValida = false;
        
        do {
        
            System.out.println("Entre com o salário:");
            
            salário = scan.nextDouble();
            
            if (salário > 0){
                infoValida = true;
            }else{
                System.out.println("Salário precisa ser maior que 0.");
            }
        }while (!infoValida);
    
              do {
        
            System.out.println("Entre com o sexo:");
            
            sexo = scan.next();
            
            if (sexo.equalsIgnoreCase("F") || 
                    sexo.equalsIgnoreCase("M")){
                infoValida = true;
            }else{
                System.out.println("Sexo prexisa ser 'f 'ou 'm' .");
            }
        }while (!infoValida);
              
               do {
        
            System.out.println("Entre com o estado civil:");
            
            estadoCivil = scan.next();
            
            if (estadoCivil.equalsIgnoreCase("S")|| 
                    estadoCivil.equalsIgnoreCase("C")||
                    estadoCivil.equalsIgnoreCase("D")||
                    estadoCivil.equalsIgnoreCase("V")){
                infoValida = true;
            }else{
                System.out.println("Estado civil precisa ser: 's', 'c', 'd' ou 'v'.");
            }
        }while (!infoValida);
        
               System.out.println("As seguintes informações foram coletadas:");
               System.out.println("Nome" + nome);
               System.out.println("Idade" + idade);
               System.out.println("Salário" + salário);
               System.out.println("Sexo" + sexo);
               System.out.println("Estado Civil" + estadoCivil);
               
    }  
}
