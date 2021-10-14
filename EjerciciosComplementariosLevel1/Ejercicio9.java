package com.informatorio;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");

        String frase = scan.nextLine();

        int contador = 1;
        for (int i=0; i<frase.length(); i++){
            if(Integer.valueOf(frase.charAt(i)) == 32){
                contador++;
            }
        }

        System.out.println("hay en la frase "+ contador+" palabras");
    }
}
