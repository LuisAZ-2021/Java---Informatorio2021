package com.informatorio;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main (String [] args){
        ArrayList<String> listaDeValores;
        System.out.println("Ingrese dos números donde el primero tiene que ser menor al segundo..");

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el primero número: ");
        Integer primerNumero= scan.nextInt();
        System.out.println("Ingrese el segundo número: ");
        Integer segundoNúmero = scan.nextInt();

        while (primerNumero >= segundoNúmero){
            System.out.println("Error! El primero número no es menor al segundo: ");
            System.out.println("Ingrese nuevamente el primer número: ");
            primerNumero=scan.nextInt();
            System.out.println("Ingrese el segundo número: ");
            segundoNúmero=scan.nextInt();
        }

        listaDeValores=devolverlista(primerNumero,segundoNúmero);

        for (String lista: listaDeValores){
            System.out.print(lista + " ");
        }

    }

    public static ArrayList<String> devolverlista(Integer numero1, Integer numero2) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add(String.valueOf(numero1));
        for (int i = numero1+1; i <numero2-1; i++) {
            if ((i % 2 == 0) && (i % 3 != 0)) {
                lista.add("Fizz");
            }else  if((i % 2 != 0) && (i % 3 == 0)){
                lista.add("Buzz");
            }else if((i % 2 == 0) && (i % 3 == 0)){
                lista.add("FizzBuzz");
            }else {
                lista.add(String.valueOf(i));
            }
        }
        lista.add(String.valueOf(numero2-1));
        return lista;
    }


}
