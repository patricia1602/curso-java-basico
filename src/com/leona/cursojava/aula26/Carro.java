package com.leona.cursojava.aula26;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro e:" + capCombustivel * consumoCombustivel + "Km");
    }

    double obterAutonomia() {

        System.out.println("Metodo obter autonomia foi chamado.");

        return capCombustivel * consumoCombustivel;
    }
}
