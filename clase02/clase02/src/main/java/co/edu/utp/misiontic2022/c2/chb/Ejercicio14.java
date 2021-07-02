package co.edu.utp.misiontic2022.c2.chb;

import java.util.Scanner;

public class Ejercicio14 {
 
    public static void main(String[] args) {
        
     System.out.println("*** PROGRAMA PARA MOSTRAR SERIE DE FIBONACCI ***");
     
     Scanner sc = new Scanner(System.in);
     
     int n, firstTerm = 0;
     int fibonacci = 1;
     int nextTerm;

     System.out.println("¿Cuántos números de la serie Fibonacci desea generar?");
     n = sc.nextInt();
     sc.close();
    
     //Imprimimos la serie de fibonacci
     System.out.println("La serie Fibonacci de los " + n + " términos solicitados es la siguiente: ");
     
        for (int i = 1; i <= n; i++){
            nextTerm = firstTerm;
            firstTerm = fibonacci + firstTerm;
            fibonacci = nextTerm;
            System.out.println(fibonacci);
        }
        
    }
}
