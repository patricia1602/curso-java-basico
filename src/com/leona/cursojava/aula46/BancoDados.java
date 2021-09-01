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
public interface BancoDados extends SqIDCL, SqIDML, SqIDDL{
    
    void abrirConexao();
    void fexharConexao();
}
