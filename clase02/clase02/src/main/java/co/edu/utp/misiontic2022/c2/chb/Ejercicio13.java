package co.edu.utp.misiontic2022.c2.chb;

import java.util.Scanner;

public class Ejercicio13 {

    /* Programa que pase de pesos a dólares y viceversa */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("*** PROGRAMA PARA CALCULAR LA CONVERSIÓN DE DIVISAS ***\n\n");
        System.out.println("INGRESE UN NÚMERO DE ACUERDO A LA CONVERSIÓN QUE DESEA");
        System.out.println("1. (USD) Dólares a pesos colombianos");
        System.out.println("2. (COP) Pesos colombianos a Dólares");

        double valorDolar = 3767.50;

        int opcion;
        opcion = sc.nextInt();

        if (opcion == 1) {
            double Dolares, result;
            System.out.println("Ingrese la cantidad de dólares a convertir en pesos COP: ");
            Dolares = sc.nextDouble();
            result = valorDolar * Dolares;
            System.out.println("$" + Dolares + " Dólares es igual a: " + result + " pesos COP");
        } else {
            if (opcion == 2) {
                double Pesos, result;
                System.out.println("Ingrese la cantidad de Pesos COP a convertir en dólares: ");
                Pesos = sc.nextDouble();
                result = Pesos / valorDolar;
                System.out.println("$" + Pesos + " Pesos COP es igual a: " + result + " dólares USD");
            }
        }
        sc.close();
    }
}
