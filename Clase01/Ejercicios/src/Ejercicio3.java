import java.util.Scanner;

public class Ejercicio3 {
    

    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
        int numero;
        System.out.println("** PROGRAMA PARA OBTENER EL DOBLE Y EL TRIPLE DE UN NÚMERO DADO **");
        System.out.println("Por favor ingresa un número entero");
        numero = sc.nextInt();
        sc.close();
        System.out.println("El número introducido es: " + numero);
        System.out.println("El doble es: " + (2 * numero));
        System.out.println("El triple es: " + (3 * numero));
        
    }

}
