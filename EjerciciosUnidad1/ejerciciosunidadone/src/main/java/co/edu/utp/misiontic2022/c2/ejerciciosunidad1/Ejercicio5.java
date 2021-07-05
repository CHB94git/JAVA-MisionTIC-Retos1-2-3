package co.edu.utp.misiontic2022.c2.ejerciciosunidad1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

    /*
     * Generar un número aleatorio entre el 1 y el 100, el usuario lo tiene que
     * adivinar introduciendo el número por teclado. En el caso que el número a
     * adivinar sea mayor al ingresado, decirle al usuario “El número que busca es
     * mayor”, de lo contrario, “El número que busca es menor”. El programa
     * finalizará cuando se introduzca el número correcto. Nota: usar la clase
     * Random para generar el número aleatorio
     */

    public static void main(String[] args) {

        Random r = new Random();
        int randNum = r.nextInt(101);
        Scanner sc = new Scanner(System.in);
        int userNum = -1;
        int intentos = 0;
        
        System.out.println("*** PROGRAMA PARA ADIVINAR UN NÚMERO GENERADO ALEATORIAMENTE ***");
        while (userNum != randNum) {
            System.out.println("Adivina el número aleatorio entre 0 y 100, vamos inténtalo!!");
            userNum = sc.nextInt();
            
            if (userNum != randNum) {
                intentos++;
                System.out.println("Fallaste! Intentos realizados: " + intentos);
            } else if (userNum == randNum) {
                System.out.println("Acertaste!");
            }

            if (userNum < randNum) {
                System.out.println("EL número que busca es mayor, inténtalo de nuevo, ánimo!!");
            } else if (userNum > randNum) {
                System.out.println("El número que busca es menor, inténtalo de nuevo");
            }
        }
        sc.close();

    }
}
