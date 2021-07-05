import java.util.Scanner;

public class Ejercicio5 {

  public static void main(String[] args) {

    /*
     * Escribe un programa java que lea una variable de tipo entero y asígnale un
     * valor A continuación muestra un mensaje indicando si la variable es par o
     * impar Utiliza el operador condicional para resolverlo Ej 14 es par o 15 es
     * impar
     */

    /* 
    int num = 14; //Asignación de valor
    String resultado;
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
