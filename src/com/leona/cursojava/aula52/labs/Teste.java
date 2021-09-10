package com.leona.cursojava.aula52.labs;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Teste {

    public static void main(String[] args) throws AgendacheiaException {

        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();
        Contato[] contato = new Contato[5];

        /* int opcao = 1;
        
        while (opcao !=3){
             opcao = obterOpcaoMenu(scan);
    }
          if(opcao == 1){//Consultar contato  
              consultarContato(scan, [agenda);
        }else if(opcao == 2){//Adicionar contato
              adicionarContato(scan, agenda);
        }*/
        int opcao = obterOpcaoMenu(scan);

        if (opcao == 1) {//Consultar contato  
            consultarContato(scan, agenda);
        } else if (opcao == 2) {//Adicionar contato
            adicionarContato(scan, agenda);
        } else if (opcao == 3) {
            System.exit(0);
        }

    }

    public static void adicionarContato(Scanner scan, Agenda agenda) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Criando um contato, entre com as informaçoes" + (i + 1));
            Contato contato = new Contato();

            String nome = leInformacaoString(scan, "Entre com o nome do contato");
            contato.setNome(nome);
            String telefone = leInformacaoString(scan, "Entre com o telefone do contato");
            contato.setTelefone(telefone);
            String email = leInformacaoString(scan, "Entre com o nome email do contato");
            contato.setEmail(email);

            System.out.println("Contato a ser criado: ");
            System.out.println(contato);

            try {
                agenda.adicionarContato(contato);
            } catch (AgendacheiaException ex) {

            }

            System.out.println("Contatos da agenda");
            System.out.println(agenda);

        }
    }

    public static void consultarContato(Scanner scan, Agenda agenda) {
        String nomeContato = leInformacaoString(scan, "Entre com o nome do contato a ser pesquisado:");
        try {
            if (agenda.consultaContatoPorNome(nomeContato) >= 0) {
                System.out.println("Contato existe");
            }
        } catch (ContatoNaoExisteException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String leInformacaoString(Scanner scan, String msg) {
        System.out.println(msg);
        String entrada = scan.nextLine();
        return entrada;
    }

    public static int obterOpcaoMenu(Scanner scan) {

        boolean entradaValida = false;
        int opcao = 3;

        while (!entradaValida) {
            System.out.println("Digite o opcao desejada:");
            System.out.println("1: Consultar contato");
            System.out.println("2: Adicionar contato");
            System.out.println("3: Sair");

            try {
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao == 1 || opcao == 2 || opcao == 3) {
                    entradaValida = true;
                } else {
                    throw new Exception("Entrada invalida");
                }
            } catch (Exception e) {
                System.out.println("Entrada invalida, digite novamente\n");
            }
        }
        return opcao;
    }
}
