package com.leona.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][][] compromissos = new String[12][31][8];

        boolean sair = false;
        byte opçao;
        while (!sair) {

            System.out.println("Digite 1 para adicionar compromisso.");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite 0 para sair.");

            opçao = scan.nextByte();

            if (opçao == 1) {// adicionar compromisso

                boolean mesValido = false;
                int mes = 0;
                while (!mesValido) {
                    System.out.println("Entre com o mes");
                    mes = scan.nextInt();
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mes invalido, digite novamente");
                    }
                }

                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.println("Entre com o dia do mes");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia invalido, digite novamente");
                    }
                }
                boolean horaValida = false;
                int hora = 0;
                while (!horaValida) {
                    System.out.println("Entre com a hora do compromisso");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 8) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora invalida, digite novamente");
                    }
                }

                mes--;
                dia--;
                System.out.println("Digite ocompromisso");
                compromissos[mes][dia][hora] = scan.next();

            } else if (opçao == 2) {// verificar compromisso

                boolean mesValido = false;
                int mes = 0;
                while (!mesValido) {
                    System.out.println("Entre com o mes");
                    mes = scan.nextInt();
                    if (mes > 0 && mes <= 31) {
                        mesValido = true;
                    } else {
                        System.out.println("Mes invalido, digite novamente");
                    }
                }

                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.println("Entre com o dia do mes");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia invalido, digite novamente");
                    }
                }

                boolean horaValida = false;
                int hora = 0;
                while (!horaValida) {
                    System.out.println("Entre com a hora do compromisso");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 8) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora invalida, digite novamente");
                    }
                }

                mes--;
                dia--;
                System.out.println("O compromisso agendado e:");
                System.out.println(compromissos[mes][dia][hora]);

            } else if (opçao == 0) {
                sair = true;
            } else {
                System.out.println("Opçao invalida, digite novamente");
            }
        }
    }
}
