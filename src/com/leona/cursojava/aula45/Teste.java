/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula45;

/**
 *
 * @author leona
 */
public class Teste {

    public static void main(String[] args) {

       /* Pessoa aluno = new Aluno();
        Pessoa alunoPessoa = aluno; //upcasting

        Pessoa aluno2 = (Pessoa) new Aluno();//dowcasting

        Pessoa aluno3 = new Pessoa();
        Aluno aluno4 = (Aluno) aluno3;*/
       
       Pessoa pessoa = new Pessoa();
       Aluno aluno = new Aluno();
       Professor professor = new Professor();
       
       if (pessoa instanceof Pessoa){
           System.err.println("e dop tipo Pessoa");
        }
       if(aluno instanceof Aluno){
           System.err.println("e do tipo Aluno");
       }
       if(professor instanceof Professor){
           System.err.println("e do tipo Professor");
       
       }
    }
}
