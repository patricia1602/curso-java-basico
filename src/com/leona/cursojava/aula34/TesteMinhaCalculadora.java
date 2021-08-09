package com.leona.cursojava.aula34;

public class TesteMinhaCalculadora {
  
    static int resultSoma;
    
    public static void main(String[] args) {

        resultSoma = MinhaCalculadora.soma(1,2);
        
       //MinhaCalculadora calc = new MinhaCalculadora();

       //calc.soma(1, 2);
       //calc.soma(1.0, 2.0);
    
       soma2valores(1, 2);
    }
    
        static int  soma2valores(int num1,int num2){
        return MinhaCalculadora.soma(num1, num2);
    }
}