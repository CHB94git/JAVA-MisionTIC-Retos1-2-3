package co.edu.utp.misiontic2022.c2.chb;

import java.util.Scanner;

public class Ejercicio8 {

    /*
     * Programa que lea dos números por teclado y muestre el resultado de la
     * división del primer número por el segundo Se debe comprobar que el divisor no
     * puede ser cero
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("*** PROGRAMA PARA DIVIDIR Y COMPROBAR DIVISOR ***");

        double num1, num2;

        System.out.println("Ingresa el primer número: ");
        num1 = input.nextDouble();

        System.out.println("Ingresa el segundo número (Divisor)");
        num2 = input.nextDouble();
        input.close();

        if (num2 == 0) {
            System.out.println("El divisor no puede ser 0, Operación inexistente!!");
        } else {
            double resultado = num1 / num2;
            System.out.println("El resultado de dividir " + num1 + " entre " + num2 + " es: " + resultado);
        }
    }
}
