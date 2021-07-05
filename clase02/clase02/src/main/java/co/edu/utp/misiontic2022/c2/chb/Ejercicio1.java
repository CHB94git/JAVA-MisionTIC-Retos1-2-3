package co.edu.utp.misiontic2022.c2.chb;

import java.util.Scanner;

public class Ejercicio1 {

    /*
     * Programa que pida por teclado la fecha de nacimiento de una persona (día,
     * mes, año) y calcule su número de la El número de la suerte se calcula sumando
     * el día, mes y año de la fecha de nacimiento y a continuación sumando las
     * cifras obtenidas en la suma. Por ejemplo: Si la fecha de nacimiento es
     * 12/07/1980 Calculamos el número de la suerte así: 12+7+1980 = 1999 1+9+9+9 =
     * 28 Número de la suerte: 28
     */
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("*** PROGRAMA PARA CALCULAR NÚMERO DE LA SUERTE ACORDE A UNA FECHA ***");
        System.out.println("Ingresa una fecha con formato: dd/mm/aaaa, Example: 10/12/1904");
        var fecha = sc.nextLine();
        sc.close();

        System.out.println("Su número de la suerte es: " + numeroSuerte(fecha));
    }

    public static int numeroSuerte(String fechaNacimiento) {

        var indiceSeparador = fechaNacimiento.indexOf("/");
        var dia = Integer.parseInt(fechaNacimiento.substring(0, indiceSeparador));

        var indiceSeparadorMes = fechaNacimiento.indexOf("/", ++indiceSeparador);
        var mes = Integer.parseInt(fechaNacimiento.substring(indiceSeparador, indiceSeparadorMes++));

        var anio = Integer.parseInt(fechaNacimiento.substring(indiceSeparadorMes));

        var suma = dia + mes + anio;
        var resultado = 0;

        while (suma != 0) {
            resultado += suma % 10;
            suma /= 10;
        }
        return resultado;
    }

}
