/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula61;

/**
 *
 * @author leona
 */
public class Contato {
    
    private String nome;
    private String telefone;
    private String email;
    
    public Contato(String nome, String telefone, String email){
        super();
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        
    }
    
    public Contato(){}
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString(){
        return "Contato[nome = "+ nome + ", telefone =" +telefone +", email = "+email +"]";
    }
    
    
}
