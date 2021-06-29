package com.leona.cursojava.aula27;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro e:" + capCombustivel * consumoCombustivel + "Km");        
    }
    
    double obterAutonomia(){
    
        System.out.println("Metdo obter autonomia foi chamado:");
        
        return capCombustivel * consumoCombustivel;
    }
    
    double calcularCombustivel(double km){
    
        double qtdCombustivel = km/ consumoCombustivel;
        
        return qtdCombustivel;
    }
}
