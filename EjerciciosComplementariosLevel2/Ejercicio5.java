package com.informatorio;

import java.util.ArrayList;

public class Ejercicio5 {
    public static void main (String [] args){
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        ArrayList<Integer> resultados = new ArrayList<>();

        array1.add(6);
        array1.add(7);
        array1.add(8);
        array1.add(4);
        array1.add(5);

        array2.add(350);
        array2.add(345);
        array2.add(550);
        array2.add(600);
        array2.add(320);

        Integer total = 0;
        for (int i = 0; i<array1.size();i++){
            int resultado=array1.get(i)*array2.get(i);

            resultados.add(resultado);
            total=total+resultado;
        }

        System.out.print("[");
        for (int i=0; i<resultados.size();i++){
            System.out.print(resultados.get(i));
            if(i!=resultados.size()-1){
                System.out.print(",");
            }
        }
        System.out.print("]");

        System.out.println("\nTotal Final es: $ " + total);
    }
}
