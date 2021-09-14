/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula58;

/**
 *
 * @author leona
 */
public class TesteAutoBoxing {

    public static void main(String[] args) {

        //autoboxing
        Short num7 = 1;
        Byte num8 = 10;
        Integer num9 = 100;
        Long num10 = 1000l; //new Long(10000l);
        Float num11 = 3.5f; //new Float(3.5f);
        Double num12 = 2.55555;
        Boolean flag2 = true;
        Character b = 'b';

        //auto un-boxing
        int num13 = num9; //num9.intValue();

        //autoboxing em expressoes
        num9++;
        
        System.out.println(num9);

        //autounboxing num9 -> autoboxing num13/num9 -> num14
        Integer num14 = num13/num9;
        
        //mau uso
       /* Double a, b, c;
        a = 10.0;
        b = 12.2;
        c = 4.7;
        
        Double media = (a+b+c)/3;
        System.out.println(media);*/
        
    }
}
