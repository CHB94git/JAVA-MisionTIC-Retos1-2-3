package co.edu.utp.misiontic2022.c2.ejerciciosunidad1;

import java.util.Scanner;

public class Ejercicio3 {

    /*
     * Realizar un programa que calcule el sueldo de un trabajador, el programa
     * solicita el número de horas que has trabajado en un mes, las horas se pagan a
     * $30.000
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("*** PROGRAMA QUE CALCULA EL SUELDO MENSUAL DE ACUERDO A LAS HORAS TRABAJADAS ***");

        double sueldo;
        int valorHora = 30000;

        System.out.println("Ingresa la cantidad de horas trabajadas: ");

        int horasTrab = sc.nextInt();
        sc.close();

        sueldo = horasTrab * valorHora;

        System.out.printf("Las horas trabajadas son: %d\nel valor de la hora es: %d y el sueldo mensual es: %.2f",
                horasTrab, valorHora, sueldo);
    }

}
