import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        var num = sc.nextInt();

        var digitos = numeroDigitos(num);
        System.out.println("El número tiene " + digitos + " cifras");

    }

    public static int numeroDigitos(int num){
        var cifras = 0;

        while (num != 0) {
            num /= 10;
            cifras++;
        }
        return cifras;
    }
}
