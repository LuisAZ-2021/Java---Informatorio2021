package com.informatorio;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main (String [] args){
        ArrayList<String> listaAlumnos = new ArrayList<>();
        List<String> cursoInformatica ;
        List<String> cursoDeMatematica;
        List<String> cursoDeInlges;

        cargarAlumnos(listaAlumnos);

        System.out.println("Lista de alumnos: ");
        mostrarAlumnos(listaAlumnos);

        cursoInformatica= listaAlumnos.subList(0,3);
        System.out.println("El curso de informatica tiene los alumnos: ");
        mostrarAlumnos(cursoInformatica);

        cursoDeMatematica= listaAlumnos.subList(3,6);
        System.out.println("El curso de matemáticas tiene los alumnos: ");
        mostrarAlumnos(cursoDeMatematica);

        cursoDeInlges = listaAlumnos.subList(6,12);
        System.out.println("El curso de inglés tiene los alumnos: ");
        mostrarAlumnos(cursoDeInlges);

    }

    public static void cargarAlumnos(ArrayList<String> listaAlumnos){
        listaAlumnos.add("Marcos");
        listaAlumnos.add("Esteban");
        listaAlumnos.add("Daniel");
        listaAlumnos.add("Antonela");
        listaAlumnos.add("María");
        listaAlumnos.add("Isabel");
        listaAlumnos.add("Mariela");
        listaAlumnos.add("Martin");
        listaAlumnos.add("Elias");
        listaAlumnos.add("Fernando");
        listaAlumnos.add("Marisel");
        listaAlumnos.add("Lautaro");
    }

    public static void mostrarAlumnos(List<String> listaAlumnos){
        for (String alumnos: listaAlumnos){
            System.out.println(alumnos);
        }
    }
}
