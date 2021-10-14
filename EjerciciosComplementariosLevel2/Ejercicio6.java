package com.informatorio;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicio6 {
    public static void main (String [] args){

        Set<Empleado> listaEmpleados = new HashSet<Empleado>();
        Map<Integer,Integer> sueldo = new HashMap<>();

        Empleado empleado1 = new Empleado("Juan Perez",34666444,8,350);
        Empleado empleado2 = new Empleado("Maria Gomez",33555789,9,450);
        Empleado empleado3 = new Empleado("Pedro Garcia",37888999,12,400);
        Empleado empleado4 = new Empleado("Gustavo Fernandez",38999777,8,400);
        Empleado empleado5 = new Empleado("Adriana Segovia",33999666,9,350);

        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
        listaEmpleados.add(empleado3);
        listaEmpleados.add(empleado4);
        listaEmpleados.add(empleado5);

        System.out.println("Lista de Empleados: ");

        for (Empleado empleado: listaEmpleados){
            System.out.println(empleado);
        }

        for (Empleado empleado: listaEmpleados){
            sueldo.put(empleado.dni,empleado.horasTrabajadas*empleado.valorPorHora);
        }

        System.out.println("\nEl sueldo de los empleados a travez del dni es: ");
        for (Map.Entry<Integer,Integer> registro: sueldo.entrySet()){
            System.out.println("DNI: "+ registro.getKey() + ", sueldo: $"+ registro.getValue());
        }


    }
}

class Empleado {
    public String nombreyApellido = "";
    public Integer dni;
    public Integer horasTrabajadas;
    public Integer valorPorHora;

    public Empleado(){}

    public Empleado(String nombreyApellido, Integer dni, Integer horasTrabajadas, Integer valorPorHora){
        this.nombreyApellido=nombreyApellido;
        this.dni=dni;
        this.horasTrabajadas=horasTrabajadas;
        this.valorPorHora=valorPorHora;
    }

    @Override
    public String toString() {
        return  "Nombre y Apellido='" + nombreyApellido + '\'' +
                ", Dni=" + dni +
                ", Horas Trabajadas=" + horasTrabajadas +
                ", Valor Por Hora=" + valorPorHora;
    }
}
