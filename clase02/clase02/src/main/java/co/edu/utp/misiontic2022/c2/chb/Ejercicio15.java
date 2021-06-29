package co.edu.utp.misiontic2022.c2.chb;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        /*
         * Leer un número N y calcular la suma de los factoriales de los números desde 0
         * hasta N
         */

        System.out.println("*** PROGRAMA PARA CALCULAR LA SUMA DE LOS FACTORIALES HASTA UN NÚMERO N DADO");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar un número N: ");
        
        int n = sc.nextInt();
        int iFactorial = 1;
        int sumaFactoriales = 0;

        for (int i = 1; i <= n; i++){
            iFactorial *= i;
            System.out.printf("%d! = %d%n\n", i, iFactorial);
            sumaFactoriales += iFactorial;
        }

        System.out.printf("La suma de los factoriales hasta " + n + "!" + " es: %d%n", sumaFactoriales);
        
    }
}
