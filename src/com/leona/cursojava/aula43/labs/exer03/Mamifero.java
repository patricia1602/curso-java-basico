/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula43.labs.exer03;

/**
 *
 * @author leona
 */
public class Mamifero extends Animal{
    
    private String alimento;
    
    public Mamifero(){
        super();
        this.setCor("Castanho");
        this.setAmbiente("Terra");
        this.alimento = "Mel";
    }

    /**
     * @return the alimneto
     */
    public String getAlimneto() {
        return alimento;
    }

    /**
     * @param alimneto the alimneto to set
     */
    public void setAlimneto(String alimneto) {
        this.alimento = alimneto;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "\nAlimento: " + alimento;
        return s;
    }
   
}
