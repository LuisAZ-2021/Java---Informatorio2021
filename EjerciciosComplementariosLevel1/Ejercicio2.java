package com.informatorio;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String [] args){
        System.out.println("Ingrese un número: ");

        Scanner scan = new Scanner(System.in);

        Integer primerNumero=Integer.valueOf(scan.nextLine());

        System.out.println("Ingrese otro número: ");

        Integer segundoNumero=Integer.valueOf(scan.nextLine());

        System.out.println("La suma de ambos valores es: " + (primerNumero + segundoNumero));
        System.out.println("La resta de ambos números es: " + (primerNumero - segundoNumero));
        System.out.println("La multiplicación de ambos numeros es: "+(primerNumero * segundoNumero));

        if (segundoNumero == 0){
            System.out.println("No se puede dividir por cero");
        }else {
            System.out.println("El resultado de la division es: "+ (primerNumero/segundoNumero));
        }

        System.out.println("El resto de la división es: "+(primerNumero % segundoNumero));
    }
}
