/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula44;

/**
 *
 * @author leona
 */
public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimaçao{
    
    private String tamanho;
    private String raça;

    /**
     * @return the tamanho
     */
    public String getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * @return the raça
     */
    public String getRaça() {
        return raça;
    }

    /**
     * @param raça the raça to set
     */
    public void setRaça(String raça) {
        this.raça = raça;
    }

    @Override
    public void amamentar() {
       
    }

    @Override
    public void emitirSom() {
        
    }

    @Override
    public void levareterinario() {
        
    }

    @Override
    public void alimentar() {

    }

    @Override
    public void brincar() {
    }

    @Override
    public void levarPassear() {
    }
    
    
}
