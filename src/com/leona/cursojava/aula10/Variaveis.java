package com.leona.cursojava.aula10;

public class Variaveis {

    public static void main(String[] args) {

        //convenção java
        int idade = 20;
        String nome = "Patricia";
        String nomeDoMeuCachorro = "Baby";
        String ano2014 = "2014";

        //aceito mas não utilizado
        int _idade;
        int $nome;

        // não é convenção java
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        String nomeDoMeucachorro;

        idade = 25;

        System.out.println("idade = " + idade);
        System.out.println("nome = " + nome);
        System.out.println("nomeDoMeuCachorro = " + nomeDoMeuCachorro);
        
        //má prática
        int a = 10;
        String b = "Patricia";
    }

}
