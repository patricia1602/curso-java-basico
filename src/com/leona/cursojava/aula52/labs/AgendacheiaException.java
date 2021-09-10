/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula52.labs;

/**
 *
 * @author leona
 */
public class AgendacheiaException extends Exception {

    @Override
    public String getMessage() {
        return "Agenda ja esta cheia";
    }

}
