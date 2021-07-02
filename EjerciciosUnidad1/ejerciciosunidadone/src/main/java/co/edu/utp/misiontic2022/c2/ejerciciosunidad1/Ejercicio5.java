package co.edu.utp.misiontic2022.c2.ejerciciosunidad1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Random r = new Random();
        int randNum = r.nextInt(101);
        Scanner sc = new Scanner(System.in);
        int userNum = -1;
        System.out.println(randNum);

        while (userNum != randNum) {
            System.out.println("Adivina el número aleatorio entre 0 y 100, vamos inténtalo!!");
            userNum = sc.nextInt();

            if (userNum != randNum) {
                System.out.println("Fallaste!");
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
