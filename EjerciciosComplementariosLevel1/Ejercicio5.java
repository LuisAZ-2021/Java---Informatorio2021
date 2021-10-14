package com.informatorio;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String [] args){
        System.out.println("Ingrese un número para realizar la multiplicación: ");
        Scanner scan = new Scanner(System.in);
        Integer primerNumero = scan.nextInt();
        System.out.println("Ingrese el número por el cual quiere multiplicar: ");
        Integer segundoNumero= scan.nextInt();

        System.out.println("El resultado de la multiplicación es: " + suma(primerNumero,segundoNumero));
    }

    public static int suma(Integer primerNumero, Integer segundoNumero){
        Integer acum=0;
        for (int i = 0 ; i< segundoNumero; i++){
            acum= acum + primerNumero;
        }
        return acum;
    }
}
