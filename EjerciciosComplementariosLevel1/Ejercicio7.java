package com.informatorio;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main (String [] args){

        System.out.println("Ingrese una palabra en minúscula");

        Scanner scan = new Scanner(System.in);

        String palabra= scan.nextLine();

        for (int i=0; i< palabra.length();i++){
            int valor=Integer.valueOf(palabra.charAt(i))-32;
            char a=(char) valor;
            System.out.print(a);
        }

    }
}
