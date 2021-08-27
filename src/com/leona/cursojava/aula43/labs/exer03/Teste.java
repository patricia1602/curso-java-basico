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
public class Teste {

    public static void main(String[] args) {

        Animal camelo = new Animal();
        camelo.setNome("camelo");
        camelo.setComprimento(150);
        camelo.setCor("amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2);

        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarao");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5);

        Mamifero urso = new Mamifero();
        urso.setNome("Usro-do-Canada");
        urso.setComprimento(180);
        urso.setCor("Vermelho");
        urso.setVelocidade(0.5);

        Animal[] animais = new Animal[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = urso;

        System.out.println("----------------------------");
        for (Animal animal : animais) {
            System.out.println(animal);
            System.out.println("----------------------------");
        }
    }
}
