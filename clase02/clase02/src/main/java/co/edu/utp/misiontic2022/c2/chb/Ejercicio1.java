package co.edu.utp.misiontic2022.c2.chb;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
//        Scanner sc = new Scanner(System.in);

        System.out.println("Su número de la suerte es: "+ numeroSuerte("17/10/1994"));
    }

    public static int numeroSuerte(String fechaNacimiento){

        var indiceSeparador = fechaNacimiento.indexOf("/");
        var dia = Integer.parseInt(fechaNacimiento.substring(0, indiceSeparador));

        var indiceSeparadorMes = fechaNacimiento.indexOf("/",++indiceSeparador);
        var mes = Integer.parseInt(fechaNacimiento.substring(indiceSeparador, indiceSeparadorMes++));

        var anio = Integer.parseInt(fechaNacimiento.substring(indiceSeparadorMes));

        var suma = dia + mes + anio;
        var resultado = 0;

        while (suma != 0) {
            resultado+= suma % 10;
            suma /=10;
        }
        return resultado;
    }
    
}
