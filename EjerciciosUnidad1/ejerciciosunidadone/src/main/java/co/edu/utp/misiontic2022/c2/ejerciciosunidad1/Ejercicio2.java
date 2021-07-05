package co.edu.utp.misiontic2022.c2.ejerciciosunidad1;

import java.util.Scanner;

public class Ejercicio2 {

    /*
     * Realizar un programa que realice el promedio de las notas de un alumno, para
     * ello el programa va a tener que solicitar el nombre del alumno y las notas de
     * las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a 3.0
     * también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir
     * “Reprobado” . Requisitos: Las notas que se ingresan pueden tener decimales
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("*** PROGRAMA PARA CALCULAR EL PROMEDIO DE 3 NOTAS DADAS ***");

        float[] notasAlumno = new float[3];
        float acumuladoNotas = 0;
        float promedio = 0;

        for (int i = 0; i < notasAlumno.length; i++) {
            System.out.println("Ingresa la nota: " + (i + 1));
            notasAlumno[i] = sc.nextFloat();
        }
        sc.close();
        // Ciclo foreach
        for (float f : notasAlumno) {
            acumuladoNotas += f;
        }
        promedio = acumuladoNotas / notasAlumno.length;
        System.out.println("El promedio del alumno es: " + promedio);

        if (promedio >= 3.0) {
            System.out.println("APROBADO!");
        } else {
            System.out.println("REPROBADO");
        }
    }
}
