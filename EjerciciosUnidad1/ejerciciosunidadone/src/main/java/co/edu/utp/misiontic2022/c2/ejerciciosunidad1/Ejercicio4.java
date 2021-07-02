package co.edu.utp.misiontic2022.c2.ejerciciosunidad1;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("***PROGRAMA PARA MOSTRAR LA TABLA DE MULTIPLICAR DEL NÚMERO INGRESADO");
        int num = sc.nextInt();
        sc.close();
        System.out.printf("TABLA DEL %d\n", num);

        for (int i = 0; i <= 10; i++) {
            int result = num * i;
            System.out.printf("%d * %d = %d\n", num, i, result);
        }
    }
}
