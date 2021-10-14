package com.informatorio;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main (String [] args){
        ArrayList<String> barajasDeCartas = new ArrayList<String>();

        cargarCartas(barajasDeCartas);

        System.out.println("Cartas: ");
        mostrarCartas(barajasDeCartas);

        System.out.println("\nEn orden inverso: ");
        for(int i=barajasDeCartas.size()-1; i>=0;i--){
            System.out.print(barajasDeCartas.get(i)+ " ");
        }

        Collections.shuffle(barajasDeCartas);

        System.out.println("\nCartas mezcladas: ");
        mostrarCartas(barajasDeCartas);
    }

    public static void cargarCartas(ArrayList<String> barajasDeCartas){

        barajasDeCartas.add("A");
        barajasDeCartas.add("2");
        barajasDeCartas.add("3");
        barajasDeCartas.add("4");
        barajasDeCartas.add("5");
        barajasDeCartas.add("6");
        barajasDeCartas.add("7");
        barajasDeCartas.add("8");
        barajasDeCartas.add("9");
        barajasDeCartas.add("10");
        barajasDeCartas.add("J");
        barajasDeCartas.add("Q");
        barajasDeCartas.add("K");
    }

    public static void mostrarCartas(ArrayList<String> barajasDeCartas){

        for (String barajas: barajasDeCartas){
            System.out.print(barajas+ " ");
        }

    }
}
