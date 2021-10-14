package com.informatorio;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String [] args){
        System.out.println("Ingrese un número");

        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();

        for (int j =1; j <= numero; j++) {

            for (int i = 1; i <= j; i++) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }
    }
}
