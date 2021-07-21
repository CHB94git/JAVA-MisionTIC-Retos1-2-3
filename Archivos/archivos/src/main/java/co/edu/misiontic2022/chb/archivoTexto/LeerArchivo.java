package co.edu.misiontic2022.chb.archivoTexto;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LeerArchivo {

    public void readFiles(String nombreArchivo) {

        var archivo = new File(nombreArchivo);
        
        if (archivo.exists()) {

            try {
                var lector = new Scanner(archivo);

                System.out.println("Números del archivo");
                while (lector.hasNext()) {
                    var numeros = new StringTokenizer(lector.next(), ",");
                    while (numeros.hasMoreTokens()) {
                        System.out.print(numeros.nextToken() + "\t");
                    }
                    System.out.println("");
                }
                lector.close();

            } catch (IOException e) {
                System.err.println(e);
            }

        } else {
            System.out.println("¡El fichero no existe!");
        }
    }
}
