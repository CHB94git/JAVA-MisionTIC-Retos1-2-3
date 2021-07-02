package co.edu.utp.misiontic2022.c2.ejerciciosunidad1;

import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        double salario;
        double salarioFinal;

        System.out.println("Ingresa un nombre: ");
        nombre = sc.nextLine();

        System.out.println("Ingresa la edad: ");
        edad = sc.nextInt();

        System.out.println("Ingresa el salario: ");
        salario = sc.nextDouble();
        sc.close();

        if (edad < 16) {
            System.out.printf("Su nombre es %s y su edad es de %d\n", nombre, edad);
            System.out.println("NO tiene edad para trabajar");
        } else if (edad >= 19 && edad <= 50) {
            System.out.printf("Su nombre es %s y su edad es de %d\n", nombre, edad);
            salarioFinal = salario + ((salario * 5) / 100);
            System.out.println("Su salario final es de: " + salarioFinal);
        } else if (edad >= 51 && edad <= 60) {
            System.out.printf("Su nombre es %s y su edad es de %d\n", nombre, edad);
            salarioFinal = salario + ((salario * 10) / 100);
            System.out.println("Su salario final es de: " + salarioFinal);
        } else if (edad > 60) {
            System.out.printf("Su nombre es %s y su edad es de %d\n", nombre, edad);
            salarioFinal = salario + ((salario * 15) / 100);
            System.out.println("Su salario final es de: " + salarioFinal);
        }
    }
}
