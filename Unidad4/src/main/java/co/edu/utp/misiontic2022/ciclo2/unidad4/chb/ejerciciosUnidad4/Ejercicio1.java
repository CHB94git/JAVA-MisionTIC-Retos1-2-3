package co.edu.utp.misiontic2022.ciclo2.unidad4.chb.ejerciciosUnidad4;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Ejercicio1 {
    
    public static void ejecutar(){

        var archivo = "ejercicio1.txt";

        try {
            var file = new File(archivo);

            if (!file.exists()) {
                System.err.println("EL archivo no existe!");
                return;
            }
            var dis = new DataInputStream(new FileInputStream(file));
            
            char character = 0;
            do {
                if (character == ' ') {
                    continue;
                }
                System.out.print(character);              
            } while ((character = (char)dis.readByte()) != '\0');
            
            dis.close();
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        
        Ejercicio1.ejecutar();
    }
}
