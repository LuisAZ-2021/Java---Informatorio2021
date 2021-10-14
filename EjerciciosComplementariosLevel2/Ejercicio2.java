package com.informatorio;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main (String [] args){
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        for (Integer num: numeros){
            System.out.println(num);
        }
        System.out.println("El tamaño es: "+numeros.size());
        numeros.add(0,8);
        numeros.add(9);
        for (Integer num: numeros){
            System.out.println(num);
        }

        System.out.println("El tamaño es: "+numeros.size());
    }
}
