package com.informatorio;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main (String [] args){
        System.out.println("Ingrese un número: ");
        Scanner scan = new Scanner(System.in);
        Integer numero = scan.nextInt();
        System.out.println("Ingrese el número por el cual quiere elevar al anterior: ");
        Integer potencia= scan.nextInt();

        System.out.println("El resultado de la potencia es: " + potenciaDelNumero(numero,potencia));
    }

    public static int potenciaDelNumero(Integer numero, Integer potencia){
        Integer acum=1;
        for (int i = 0 ; i< potencia; i++){
            acum= acum * numero;
        }
        return acum;
    }
}
