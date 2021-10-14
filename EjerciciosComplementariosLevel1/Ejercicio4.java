package com.informatorio;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        Integer numero = sc.nextInt();
        System.out.println("El factorial del numero es: " + fatorial(numero));
    }

    private static int fatorial(Integer n){
        if (n == 1){
            return n;
        }else{
            return (n * fatorial(n-1));
        }
    }
}
