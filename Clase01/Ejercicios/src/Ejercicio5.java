import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
      /*Scanner sc = new Scanner(System.in);
        //int num = 14;
        int num;
        String resultado;
        System.out.println("Introduce un número entero: ");
        num = sc.nextInt();
        resultado = (num % 2 == 0) ? "Par" : "Impar";
        System.out.printf("El número %d es %s\n", num, resultado);
        */

        System.out.println("Determinar sí un número es par o impar");
        System.out.println("Ingrese un número entero");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int residuo = num % 2;

        String resultado = (residuo == 0) ? "El número es par!" : "El número es impar";
        System.out.println(resultado);
    }
    
}
