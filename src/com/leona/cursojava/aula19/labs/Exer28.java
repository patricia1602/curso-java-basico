package com.leona.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer28 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Entre com o valor da posiçao " + i);
            vetorA[i] = scan.nextInt();

            vetorB[vetorA.length - i - 1] = vetorA[i];
        }

        System.out.print("VetorA = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("VetorB ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
    }
}
