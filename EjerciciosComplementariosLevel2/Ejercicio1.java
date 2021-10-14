package com.informatorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> ciudades = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresá tus ciudades favoritas ");
        boolean desicion = true;
        Integer contador = 1;
        do {

            System.out.println("Ciudad n° "+ contador + " : ");
            ciudades.add(scan.nextLine());

            System.out.println("¿Desea continuar?\n Si desea continuar presione cualquier tecla " +
                    "sino presione el numero 0");
            String valor = scan.nextLine();
            if (valor.equals("0")) desicion = false;

            contador++;
        }while (desicion);

        contador = 1;
        for (String ciudad: ciudades){
            System.out.println("#"+contador+" - "+ciudad);
            contador++;
        }


    }
}
