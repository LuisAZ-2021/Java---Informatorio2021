package com.informatorio;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre: ");

        Scanner scan = new Scanner(System.in);

        String nombre = scan.nextLine();

        System.out.println("HOLA " + nombre);
    }
}
