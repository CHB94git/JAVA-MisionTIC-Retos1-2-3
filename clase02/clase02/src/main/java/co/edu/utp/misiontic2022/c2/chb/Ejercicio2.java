package co.edu.utp.misiontic2022.c2.chb;

import java.util.Scanner;

public class Ejercicio2 {

    /*
     * Programa que calcule el precio de venta de un producto conociendo el precio
     * por unidad (sin IVA) del producto, el número de productos vendidos y el
     * porcentaje de IVA aplicado Los datos anteriores se leerán por teclado
     */

    public static void main(String[] args) {

        System.out.println("*** PROGRAMA PARA CALCULAR EL PRECIO DE VENTA DE UN/OS PRODUCTO/S");

        Scanner input = new Scanner(System.in);
        double costoUnidad, cantidad, iva, costoSinIva, ivaFinal;

        System.out.println("Ingrese el precio o costo de la unidad del producto sin iva: ");
        costoSinIva = input.nextDouble();

        System.out.println("Ingrese la cantidad de productos vendidos: ");
        cantidad = input.nextDouble();

        System.out.println("Ingrese el %iva a aplicar: ");
        iva = input.nextDouble();
        input.close();

        costoUnidad = costoSinIva * cantidad;
        ivaFinal = (costoUnidad * iva) / 100;

        System.out.println("Precio de venta Final de/l producto/s: " + (costoUnidad + ivaFinal));

    }

}
