package com.leona.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer35 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Entre com o valo da posiçao A - " + i);
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Analizando o numero" + vetorA[i]);

            for (int j = 1; j < vetorA.length; j++) {
                if (vetorA[i] % j == 0) {
                    System.out.println(j + " e divisor");
                }
            }
            System.out.println();
        }
    }
}
