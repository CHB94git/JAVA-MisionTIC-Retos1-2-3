package co.edu.misiontic2022.chb.ejercicios;

import java.io.IOException;

public class Entrada2 {

    public static void ejecutar() {

        byte[] buffer = new byte[255];
        System.out.println("\nEscribe el texto: ");

        try {
            System.in.read(buffer, 0, 255);
        } catch (IOException e) {
            System.err.println(e);
        }
        System.out.println("\nLa línea escrita es: ");
        System.out.println(new String(buffer));
    }
}
