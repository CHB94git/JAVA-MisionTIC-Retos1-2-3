package co.edu.utp.misiontic2022.c2.ejerciciosunidad1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("*** PROGRAMA QUE REALIZA LA SUMA, RESTA, MULTIPLICACÍON Y DIVISIÓN DE 2 NÚMEROS DADOS");

        double suma, resta, multiplicacion, division;

        System.out.println("Ingrese el primer número: ");
        double num1 = sc.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();
        sc.close();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;

        System.out.printf("La suma de %.2f y %.2f es igual a: %.2f\n\n", num1, num2, suma);
        System.out.printf("La resta de %.2f y %.2f es igual a: %.2f\n\n", num1, num2, resta);
        System.out.printf("La multiplicación de %.2f y %.2f es igual a: %.2f\n\n", num1, num2, multiplicacion);
            
        if (num2 == 0) {
            System.out.println("El divisor no puede ser 0, Operación inexistente!!");
        } else {
            System.out.printf("La división de %.2f y %.2f es igual a: %.2f\n\n", num1, num2, division);
        }

    }
}
