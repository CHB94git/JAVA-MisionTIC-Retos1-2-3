import java.util.Scanner;

public class Ejercicio2 {

    /*
     * Implemente un algoritmo que reciba un número por teclado y cuente cuántas
     * cifras (o dígitos) contiene e imprima el mensaje en consola
     */

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        var num = sc.nextInt();
        sc.close();
        var digitos = numeroDigitos(num);
        System.out.println("El número tiene " + digitos + " cifras");

    }

    public static int numeroDigitos(int num) {
        var cifras = 0;

        while (num != 0) {
            num /= 10;
            cifras++;
        }
        return cifras;
    }
}
