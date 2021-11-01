/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula64;

/**
 *
 * @author leona
 */
public class Externa {

    private String texto = "texto externo";

    public class Interna {

        private String texto = "texto interno";

        public void imprimeTexto() {
            System.out.println(texto);

            //consegue ver membros da classe externa
            System.out.println(Externa.this.texto);
        }
    }

    public static void main(String[] args) {

        Externa externa = new Externa();
        Interna interna = externa.new Interna();

        interna.imprimeTexto();
    }
}
