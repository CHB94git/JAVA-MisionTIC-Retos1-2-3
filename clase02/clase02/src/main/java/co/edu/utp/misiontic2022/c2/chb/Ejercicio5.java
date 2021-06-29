package co.edu.utp.misiontic2022.c2.chb;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        System.out.println("*** PROGRAMA PARA CALCULAR LA HIPOTENUSA DE UN TRIÁNGULO RECTÁNGULO ***");
        Scanner input = new Scanner(System.in);
        double cat1, cat2, hipotenusa;
        System.out.println("Ingrese la longitud del primer cateto");
        cat1 = input.nextDouble();
        System.out.println("Ingrese la longitud del segundo cateto");
        cat2 = input.nextDouble();
        hipotenusa = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
        System.out.println("El cateto 1 ingresado es: " + cat1 + " y el cateto 2 ingresado es: " + cat2);
        System.out.println("La hipotenusa es: " + hipotenusa);
    }
    
}
