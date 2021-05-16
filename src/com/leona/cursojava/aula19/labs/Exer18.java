package com.leona.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] idades = new int[10];

        for (int i = 0; i < idades.length; i++) {
            System.out.print("Entre com a idade da pessoa" + (i + 1));
            idades[i] = scan.nextInt();
        }
        int qtd = 0;
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > 35) {
                qtd++;
            }
        }
        System.out.print("Vetor de idades =");
        for (int i = 0; i < idades.length; i++) {
            System.out.print(idades[i] + "");
        }

        int menor = idades[0];
        int indexMenor = 0;
        int maior = idades[0];
        int indexMaior = 0;
        for (int i = 1; i < idades.length; i++) {
            if (idades[i] > maior) {
                maior = idades[i];
                indexMaior = i;
            } else if (idades[i] < menor) {
                menor = idades[i];
                indexMenor = i;
            }
        }
        System.out.print("Vetor de idades = ");
        for (int i = 0; i < idades.length; i++) {
            System.out.print(idades[i] + " ");
        }
        System.out.println();

        System.out.println("Menor idade:" + menor);
        System.out.println("Indice menor idade:" + indexMenor);
        System.out.println("Maior idade:" + maior);
        System.out.println("Indice maior idade:" + indexMaior);

    }
}
