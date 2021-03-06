package co.edu.misiontic2022.chb.archivoTexto;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EscribirArchivo {

    public void escribir(String nombreArchivo) {

        int[][] numeros = { 
                        { 1, 2, 3, 4, 5 },
                        { 6, 7, 8, 9, 10 },
                        { 11, 12, 13, 14, 15 },
                        { 16, 17, 18, 19, 20 },
                        { 21, 22, 23, 24, 25 } };

        try {
            var salida = new PrintWriter(nombreArchivo);
            for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < numeros[i].length; j++) {
                    salida.print(numeros[i][j] + ",");
                }
                salida.println("");
            }
            salida.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
