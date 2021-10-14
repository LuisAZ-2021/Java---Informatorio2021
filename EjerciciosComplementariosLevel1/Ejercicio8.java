package com.informatorio;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main (String [] args){
        String direccion = "";
        System.out.println("Ingrese nombre y apellido: ");

        Scanner scan = new Scanner(System.in);
        String nombreApellido = scan.nextLine();
        System.out.println("Ingrese edad: ");
        Integer edad = Integer.valueOf(scan.nextLine());
        System.out.println("Ingrese dirección: ");
        direccion= scan.nextLine();
        System.out.println("Ingrese Ciudad: ");
        String ciudad = scan.nextLine();

        System.out.println(ciudad +" - "+direccion+ " - " + edad + " - "+ nombreApellido);
    }
}
