/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula43;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author leona
 */
public class Aluno {

    private String curso;
    private double[] notas;

    public Aluno() {
        super();
    }

    public Aluno(String curso, String nome, String endereco, String telefone) {
       // super(nome, endereco, telefone);
        this.curso = curso;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the notas
     */
    public double[] getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    public void metodoQualquer() {
        //super.setCpf("123456789");

        //this.setCpf("123456789");
    }

    public String obterEtiquetaEndereco() {

        String s = "Endereco do Aluno: ";
        //s += super.getEndereco();

        return s;
    }

    //@Override
    public void imprimirEtiquetaEndereco() {
   
        System.out.println(this.obterEtiquetaEndereco());
  
    }
    
    @Override
    public String toString() {
        return "Aluno[curso = " + curso + ", notas = " + Arrays.toString(notas) + "]";
    }
   
    /*public String toString(){
       String s = curso + "\n";
       for(double nota : notas){
           s += nota + " ";
       }
       return s;
    }*/ 

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.curso, other.curso)) {
            return false;
        }
        if (!Arrays.equals(this.notas, other.notas)) {
            return false;
        }
        return true;
    }
    
    
}

