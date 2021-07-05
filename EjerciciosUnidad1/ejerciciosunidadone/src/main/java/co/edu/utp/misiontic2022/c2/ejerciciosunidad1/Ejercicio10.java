package co.edu.utp.misiontic2022.c2.ejerciciosunidad1;

import java.util.Scanner;

public class Ejercicio10 {

    /*
     * Muestra la serie de fibonacci hasta un número pedido por teclado. Por
     * ejemplo, si el número ingresado es el 100, debe imprimir los números 0, 1, 1,
     * 2, 3, 5, 8, 13, 21, 34, 55, 89
     */

    public static void main(String[] args) {

        System.out.println("*** PROGRAMA PARA MOSTRAR SERIE DE FIBONACCI HASTA LÍMITE DADO ***");

        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 1;
        int temp;
        int limite;

        System.out.println("Límite de la serie fibonacci: ");
        limite = sc.nextInt();
        sc.close();

        System.out.print("\nSerie de Fibonacci:\n");
        while (num1 <= limite) {
            temp = num1;
            num1 = num2 + num1;
            num2 = temp;

            System.out.println(num2);
        }
    }
}
