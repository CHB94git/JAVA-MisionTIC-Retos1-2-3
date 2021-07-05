package co.edu.utp.misiontic2022.c2.chb;

import java.util.Scanner;

public class Ejercicio4 {

    /*
     * Programa que pase una velocidad en Km/h a m/s La velocidad se lee por teclado
     */

    public static void main(String[] args) {

        System.out.println("*** PROGRAMA PARA CONVERTIR VELOCIDAD EN Km/h A m/s");

        Scanner input = new Scanner(System.in);
        float velKm, velMs;

        System.out.println("Ingrese la velocidad en km/h a convertir en m/s: ");
        velKm = input.nextFloat();
        input.close();
        velMs = ((velKm * 1000) / 3600);

        System.out.println("La velocidad ingresada es: " + velKm + " Km/h");
        System.out.println("La velocidad convertida a m/s es: " + velMs + " m/s");
    }
}
