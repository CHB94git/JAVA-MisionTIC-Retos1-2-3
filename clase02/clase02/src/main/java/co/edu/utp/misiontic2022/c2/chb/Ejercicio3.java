package co.edu.utp.misiontic2022.c2.chb;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        System.out.println("*** PROGRAMA PARA QUITAR CIFRAS A UN NÚMERO ENTERO INGRESADO ***");
        Scanner input = new Scanner(System.in);
        int n, m;

        System.out.println("Ingrese un número entero al que desee quitarle m cifras");
        n = input.nextInt();
        System.out.println("Ingrese la cantidad de cifras a quitar");
        m = input.nextInt();

        n = (n / (int)Math.pow(10, m));
        System.out.println("Número resultante después de quitarle m cifras: " + n);

    }
}
