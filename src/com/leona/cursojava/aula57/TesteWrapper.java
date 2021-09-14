/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula57;

import java.util.Objects;

/**
 *
 * @author leona
 */
public class TesteWrapper {

    public static void main(String[] args) {

        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 10000l;
        float num5 = 3.5f;
        double num6 = 3.55555;
        boolean flag = true;
        char a = 'a';

        Short num7 = new Short((short) 1);
        Byte num8 = new Byte((byte) 10);
        Integer num9 = new Integer(100);
        Long num10 = new Long(100000l);
        Float num11 = new Float(3.5f);
        Double num12 = new Double(3.5555);
        Boolean num13 = new Boolean(true);
        Character num14 = new Character('b');

        Integer num15 = new Integer("100000");

        double num16 = new Double("3.5"); //3,5 para quem usar PC portugues Brasil

        System.out.println(num15.intValue());
        System.out.println(num15.longValue());

        Long num17 = num15.longValue();

        int num18 = Integer.parseInt("100000");

        double num19 = Double.parseDouble("3.555");
        System.out.println(num19);

        Integer num20 = Integer.valueOf(1343);
        System.out.println(num20);

        System.out.println(Objects.equals(num9, num13));
    }

}
