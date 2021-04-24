package com.leona.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer25 {
    
    public static void main (String [] args){
    
        Scanner scan = new Scanner (System.in);
        
        //System.out.println("Lojas Tabajara");
        
        boolean sair = false;
         String continuarCompra;
         int qtdProdutos;
         double preço;
         double total;
         String output;
         double valorPago, troco;
         
        do{
        
            System.out.println("Deseja informar uma nova compra? S/N");
            continuarCompra = scan.next();
            
            output = "Lojas Tabajara\n";
            
            if (continuarCompra.equalsIgnoreCase("s")){
           
            System.out.println("Digite a quantidade de produtos da compra:");
            qtdProdutos = scan.nextInt();
            
            total = 0;
            
            for (int i =1; i <= qtdProdutos; i ++){
                System.out.println("Informe o preço do produto" + i);
                preço = scan.nextDouble();
                total += preço;
                
                output += "Produto" + i + ":R$" + preço + "\n";
                
            }
            
            output += "Total: R$" + total;
            
            System.out.println( "Total: R$" + total);
            
            System.out.println("Entre com o valor pago:");
            valorPago = scan.nextDouble();
            
            output += "Dinheiro: R$" + valorPago + "\n";
                    
            troco = total - valorPago;
            
            output += "Troco: R$"+ troco;
            
            System.out.println(output);
            }else {
                sair = true;
            } 
        }while (!sair);
    }
}
