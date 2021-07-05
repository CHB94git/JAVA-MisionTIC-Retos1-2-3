package co.edu.utp.misiontic2022.c2.chb;

import java.util.Scanner;

public class Ejercicio11 {

    /*
     * Programa que lea una variable entera mes y compruebe si el valor corresponde
     * a un mes de 30 días, de 31 o de 28 Supondremos que febrero tiene 28 días Se
     * mostrará además el nombre del mes Se debe comprobar que el valor introducido
     * esté comprendido entre 1 y 12
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("*** PROGRAMA PARA DETERMINAR LOS MESES DEL AÑO Y SU CANTIDAD DE DÍAS ***");

        int mes;

        System.out.println("Ingrese el número del mes: ");
        mes = input.nextInt();
        input.close();

        if (mes > 12 || mes < 1) {
            System.out.println("El número del mes que ingresaste no es válido!");
        } else {
            switch (mes) {
                case 1:
                    System.out.printf("El mes ingresado es %d y corresponde a Enero\n", mes);
                    break;
                case 2:
                    System.out.printf("El mes ingresado es %d y corresponde a Febrero\n", mes);
                    break;
                case 3:
                    System.out.printf("El mes ingresado es %d y corresponde a Marzo\n", mes);
                    break;
                case 4:
                    System.out.printf("El mes ingresado es %d y corresponde a Abril\n", mes);
                    break;
                case 5:
                    System.out.printf("El mes ingresado es %d y corresponde a Mayo\n", mes);
                    break;
                case 6:
                    System.out.printf("El mes ingresado es %d y corresponde a Junio\n", mes);
                    break;
                case 7:
                    System.out.printf("El mes ingresado es %d y corresponde a Julio\n", mes);
                    break;
                case 8:
                    System.out.printf("El mes ingresado es %d y corresponde a Agosto\n", mes);
                    break;
                case 9:
                    System.out.printf("El mes ingresado es %d y corresponde a Septiembre\n", mes);
                    break;
                case 10:
                    System.out.printf("El mes ingresado es %d y corresponde a Octubre\n", mes);
                    break;
                case 11:
                    System.out.printf("El mes ingresado es %d y corresponde a Noviembre\n", mes);
                    break;
                case 12:
                    System.out.printf("El mes ingresado es %d y corresponde a Diciembre\n", mes);
                    break;

            }

            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                System.out.println("El mes es de 31 días");
            } else if (mes == 2) {
                System.out.println("El mes es de 28 días");
            } else {
                System.out.println("El mes es de 30 días");
            }

        }

    }

}
