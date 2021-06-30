package co.edu.utp.misiontic2022.c2.chb;

import java.io.IOException;

public class Ejercicio7 {
 
    public static void main(String[] args) throws IOException {

        System.out.println("*** PROGRAMA PARA VERIFICAR SI UN CARÁCTER ESTÁ EN MAYÚSCULA");

        char caracter;
        System.out.println("Ingrese un carácter: ");
        caracter = (char) System.in.read();
        
        if (caracter >= 'A' && caracter <= 'Z') {
            System.out.println(caracter + " ... es un carácter en mayúscula");
        } else {
            System.out.println(caracter + " ... No es un carácter en mayúscula");            
        }
    
    }
    
}
