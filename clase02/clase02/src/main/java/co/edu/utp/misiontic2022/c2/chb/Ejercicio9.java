package co.edu.utp.misiontic2022.c2.chb;

import java.util.Scanner;

public class Ejercicio9 {

    /*
     * El programa lee por teclado tres números enteros y calcula y muestra el mayor
     * de los tres
     */

    public static void main(String[] args) {

        System.out.println("*** PROGRAMA PARA DETERMINAR EL NÚMERO MAYOR DE 3 VALORES DISTINTOS INGRESADOS ***");

        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Ingresa el primer número: ");
        num1 = input.nextInt();

        System.out.println("Ingresa el segundo número: ");
        num2 = input.nextInt();

        System.out.println("Ingresa el tercer número: ");
        num3 = input.nextInt();
        input.close();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("El número mayor es el primero " + "y el número es: " + num1);
            } else {
                System.out.println("El número mayor es el tercero " + "y el número es: " + num3);
            }
        } else if (num2 > num3) {
            System.out.println("El número mayor es el segundo " + "y el número es: " + num2);
        } else {
            System.out.println("El número mayor es el tercero " + "y el número es: " + num3);
        }
    }

}
