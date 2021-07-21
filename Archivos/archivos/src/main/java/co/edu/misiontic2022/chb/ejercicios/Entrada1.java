package co.edu.misiontic2022.chb.ejercicios;

import java.io.IOException;

public class Entrada1 {

    public static void ejecutar() {
        
        int numBytes = 0;
        char caracter;
        System.out.println("\nEscribe el texto: ");

        try {
            do {
                caracter = (char) System.in.read();
                System.out.print(caracter);
                numBytes++;
            } while (caracter != '\n');
            System.out.printf("%n %d bytes leídos. %n", numBytes);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
