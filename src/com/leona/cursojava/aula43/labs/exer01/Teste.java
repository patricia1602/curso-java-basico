/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula43.labs.exer01;

/**
 *
 * @author leona
 */
public class Teste {

    public static void main(String[] args) {

        System.out.println("*** Teste ContaBancaria ***");

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Cliente Conta Simples");
        contaSimples.setNumConta("11111");

        contaSimples.depositar(100);

        realizarSaque(contaSimples, 50);

        realizarSaque(contaSimples, 70);

        System.out.println(contaSimples);
    }

    private static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + " saldo de = " + conta.getSaldo());
        }

        System.out.println("*** Teste ContaPoupanca ***");

        ContaPoupanca contaPoupacanca = new ContaPoupanca();
        contaPoupacanca.setNomeCliente("Cliente Conta Poupanca");
        contaPoupacanca.setNumConta("22222");
        contaPoupacanca.setDiaRendimento(25);

        contaPoupacanca.depositar(100);

        realizarSaque(contaPoupacanca, 50);

        realizarSaque(contaPoupacanca, 70);

        if (contaPoupacanca.calcularNovoSaldo(0.5)) {
            System.out.println("Rendimento aplicado, novo saldo e de = " + contaPoupacanca.getSaldo());
        } else {
            System.out.println("Hoje nao e dia de rendimento, novo saldo nao calculado");
        }

        System.out.println(contaPoupacanca);
    }

    private static void realizarSaque(ContaPoupanca conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + " saldo de = " + conta.getSaldo());
        }

        System.out.println("*** Teste ContaEspecial ***");

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Cliente Conta Especial");
        contaEspecial.setNumConta("33333");
        contaEspecial.setLimite(50);

        contaEspecial.depositar(100);

        realizarSaque(contaEspecial, 50);

        realizarSaque(contaEspecial, 70);

        realizarSaque(contaEspecial, 80);

        System.out.println(contaEspecial);
    }

    private static void realizarSaque(ContaEspecial conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + " saldo de = " + conta.getSaldo());
        }

    }

}
