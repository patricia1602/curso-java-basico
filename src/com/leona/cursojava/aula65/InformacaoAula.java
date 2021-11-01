/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula65;

/**
 *
 * @author leona
 */
@interface InformacaoAula {
 
    String autor();
    
    int aulaNumero();
    
    String blog() default "htpp://loiane.com";
    
    String site() default "htpp://loiane.training";
    
}
