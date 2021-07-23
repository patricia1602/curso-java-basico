package com.leona.cursojava.aula29;

public class Carro {

 String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    Carro(){
        System.out.println("Classe Carro foi instanciada");
        numPassageiros = 4;
    }
    Carro(String marca_, String modelo_, int numPassageiros_,double capCombustivel_, double consumoCombustivel_){
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;
    }
    void exibirAutonomia(){
        System.out.println("A autonomia do carro e:" + capCombustivel * consumoCombustivel + "Km");        
    }
    
    double obterAutonomia(){
    
        System.out.println("Metodo obter autonomia foi chamado:");
        
        return capCombustivel * consumoCombustivel;
    }
    
    double calcularCombustivel(double km){
    
        double qtdCombustivel = km/ consumoCombustivel;
        
        return qtdCombustivel;
        }
    }    

