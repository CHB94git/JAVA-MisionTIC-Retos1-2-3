package co.edu.utp.misiontic2022.c2.chb;

public class Ejercicio16 {

    /*
     * Programa que muestre en líneas separadas lo siguiente:
     * ZYWXVUTSRQPONMLKJIHGFEDCBA 
     * YWXVUTSRQPONMLKJIHGFEDCBA 
     * WXVUTSRQPONMLKJIHGFEDCBA
     * .....
     * DCBA 
     * CBA 
     * BA 
     * A
     */

    public static void main(String[] args) {

        System.out.println("*** PROGRAMA QUE MUESTRA EL ABECEDARIO EN ORDEN DESCENDENTE Z - A ***");

        for (char secuencia1 = 'Z'; secuencia1 >= 'A'; secuencia1--) {
            for (char secuencia2 = secuencia1; secuencia2 >= 'A'; secuencia2--) {
                System.out.print(secuencia2);
            }
            System.out.println();
        }
    }
}
