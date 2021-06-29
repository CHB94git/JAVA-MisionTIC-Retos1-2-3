package co.edu.utp.misiontic2022.c2.chb;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        System.out.println("*** PROGRAMA QUE DETERMINA SI UN NÚMERO ES MÚLTIPLO DE 10***");
        Scanner input = new Scanner(System.in);
        int numero;
        System.out.println("Ingresa un número: ");
        numero = input.nextInt();

        if (numero % 10 == 0) {
            System.out.println("El número es múltiplo de 10");
        } else {
            System.out.println("El número NO es múltiplo de 10");
        }
    }
    
}
