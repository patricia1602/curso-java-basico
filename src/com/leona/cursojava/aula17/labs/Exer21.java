package com.leona.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer21 {
    
    public static void main (String [] args){
    
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Entre com o número de turmas:");
        int numTurmas = scan.nextInt();
        
        int numAlunos;
        int soma = 0;
        boolean inválido = true;
        
        for (int i=1; i <= numTurmas; i ++){
        
            inválido = true;
        do{
            System.out.println("Entre com número de alunos da turma" + i);
        numAlunos = scan.nextInt();
        
        if (numAlunos > 40){
            inválido= false;
        }else {
            System.out.println("Números de alunos inválido. Digite novamente.");
        }
        }while(inválido);
        
        soma += numAlunos;
    }
    double média = soma / numTurmas;
    
    System.out.println("Média:" + média);
    }
}
