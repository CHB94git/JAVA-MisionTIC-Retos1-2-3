package co.edu.utp.misiontic2022.c2.chb;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        System.out.println("*** PROGRAMA PARA CONVERTIR VELOCIDAD EN Km/h A m/s");
        
        Scanner input = new Scanner(System.in);
        float velKm, velMs;
        
        System.out.println("Ingrese la velocidad en km/h a convertir en m/s: ");
        velKm = input.nextFloat();
        velMs = (velKm * 1000/3600);

        System.out.println("La velocidad ingresada es: " + velKm + " Km/h");
        System.out.println("La velocidad convertida a m/s es: " + velMs + " m/s");
    }
}