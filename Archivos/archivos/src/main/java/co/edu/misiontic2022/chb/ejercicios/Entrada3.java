package co.edu.misiontic2022.chb.ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Entrada3 {
    

    public static void ejecutar(){

        String linea = null;
        var entrada = new BufferedReader(new InputStreamReader(System.in));
        var salida = new PrintWriter(System.out, true);
        salida.println("\n Escribe el texto: ");

        try {
            linea = entrada.readLine();
        } catch (Exception e) {
            System.err.println(e);
        }
        salida.println("\nLa línea escrita es: ");
        salida.println(linea);
    }
}
