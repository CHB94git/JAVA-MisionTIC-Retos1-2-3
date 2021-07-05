import java.util.Scanner;

public class Ejercicio4 {

    /*
     * Escribe un programa que lea una cantidad de grados centígrados y la pase a
     * grados Fahrenheit La fórmula es F 32 9 C 5
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double F, C;

        System.out.println("Ingrese la cantidad de grados Celsius a convertir en Farenheit: ");
        C = sc.nextDouble();
        sc.close();

        F = 32 + (9 * C / 5);

        System.out.println(C + "°" + " Grados Celsius equivalen a: " + F + "°" + " grados Farenheit");
    }
}
