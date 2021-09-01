/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula46;

/**
 *
 * @author leona
 */
public interface SqIDDL {
    
    void create(String querry);
    void alter(String querry);
    void drop (String querry);
}
