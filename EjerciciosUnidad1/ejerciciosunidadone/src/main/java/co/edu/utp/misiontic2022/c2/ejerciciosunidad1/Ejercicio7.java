package co.edu.utp.misiontic2022.c2.ejerciciosunidad1;

import java.util.Scanner;

public class Ejercicio7 {

    /*
     * Pedir un número, comprobar si es primo y preguntar si quiere introducir más
     * (S/N) y volver a pensar
     */

    Scanner sc = new Scanner(System.in);
    private boolean activo = true;
    private static Scanner sc2;

    public void verificar() {

        System.out.println("*** PROGRAMA PARA VERIFICAR SÍ UN NÚMERO INGRESADO ES PRIMO ***");
        System.out.print("false = NO es primo\ntrue = es primo\n\n");

        while (activo) {

            int primo = 0;

            System.out.println("Ingrese un número: ");
            primo = sc.nextInt();

            System.out.println(numeroPrimo(primo));
            activo = ingresarOtroNumero();
        }

    }

    public static boolean numeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        int contador = 0;
        for (int i = (int) Math.sqrt(numero); i > 1; i--) {
            if (numero % i == 0) {
                contador++;
            }
        }
        return contador < 1;
    }

    public static boolean ingresarOtroNumero() {

        System.out.println("\n¿Desea ingresar otro número a verificar?\n 1. Sí\n 2. NO");
        sc2 = new Scanner(System.in);
        int respuesta = sc2.nextInt();

        if (respuesta == 1) {
            System.out.println("Genial! continúa");
            return true;
        } else {
            System.out.println("Fin del programa");
            return false;
        }
    }
}
