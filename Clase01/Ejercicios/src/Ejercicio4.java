import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double F, C;

        System.out.println("Ingrese la cantidad de grados Celsius a convertir en Farenheit: ");
        C = sc.nextDouble();
        sc.close();
        
        F = 32 + (9 * C / 5);

        System.out.println(C + " Grados Celsius equivalen a: " + F + " grados Farenheit");
    }
}
