package co.edu.utp.misiontic2022.c2.ejerciciosunidad1;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio6 {

    /*
     * Realiza un programa que solicite el sexo (H/M) y la altura (cm) al usuario y
     * que calcule el peso ideal. 
     * ○ peso ideal mujeres = altura - 120 
     * ○ peso ideal hombres = altura - 110
     */

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("*** PROGRAMA PARA CALCULAR EL PESO IDEAL DEL USUARIO ***");

        int estatura = 0;
        float pesoIdealM, pesoIdealH;

        System.out.println("Ingresa H para calcular el peso ideal de hombres");
        System.out.println("Ingresa M para calcular el peso ideal de mujeres");

        char sexo;
        sexo = (char) System.in.read();

        if (sexo == 'H') {
            System.out.println("Has ingresado: " + sexo + " - (Hombres)");
            System.out.println("Por favor ingresa la altura en cm: ");
            estatura = sc.nextInt();

        } else if (sexo == 'M') {
            System.out.println("Has ingresado: " + sexo + " - (Mujeres)");
            System.out.println("Por favor ingresa la altura en cm: ");
            estatura = sc.nextInt();

        }

        // System.out.println("Por favor ingresa la altura en cm: ");
        // estatura = sc.nextInt();
        sc.close();

        if (sexo == 'H') {
            pesoIdealH = estatura - 110;
            System.out.println("El peso ideal es: " + pesoIdealH + " kg");
        } else if (sexo == 'M') {
            pesoIdealM = estatura - 120;
            System.out.println("El peso ideal es: " + pesoIdealM + " kg");
        }
    }
}
