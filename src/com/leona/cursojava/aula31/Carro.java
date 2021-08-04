package com.leona.cursojava.aula31;

public class Carro {

    public String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    private double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro e:" + this.capCombustivel * this.consumoCombustivel + "Km");
    }

    double obterAutonomia() {

        System.out.println("Metodo obter autonomia foi chamado:");

        return this.capCombustivel * this.consumoCombustivel;
    }

    private double dividekmPorConsumoCombustivel(double km) {
        return km / this.consumoCombustivel;
    }

    public double calcularCombustivel(double km) {

        return this.dividekmPorConsumoCombustivel(km);

    }
}
