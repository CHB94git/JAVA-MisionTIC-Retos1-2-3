package co.edu.utp.misiontic2022.c2.chb;

import java.util.Scanner;
public class Ejercicio2 {

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

        costoUnidad = costoSinIva * cantidad;
        ivaFinal = costoUnidad * iva / 100;

        System.out.println("Precio de venta Final de/l producto/s: " + (costoUnidad + ivaFinal));

    }
    
}
