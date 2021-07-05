package co.edu.utp.misiontic2022.c2.chb;

import java.util.Scanner;

public class Ejercicio10 {

    /*
     * Programa que lea por teclado tres números enteros H, M, S correspondientes a
     * hora, minutos y segundos respectivamente, y comprueba si la hora que indican
     * es una hora válida
     */

    public static void main(String[] args) {

        System.out.println("*** PROGRAMA PARA INDICAR SÍ LA HORA ES VÁLIDA ***");

        Scanner input = new Scanner(System.in);

        int h, m, s;

        System.out.println("Ingresa la hora: ");
        h = input.nextInt();

        System.out.println("Ingresa los minutos: ");
        m = input.nextInt();

        System.out.println("Ingresa los segundos: ");
        s = input.nextInt();
        input.close();

        if (h >= 0 && h <= 24 && m >= 0 && m <= 60 && s >= 0 && s <= 60) {
            System.out.println("La hora que ingresaste es correcta!");
        } else {
            System.out.println("La hora es incorrecta!");
        }
    }
}
