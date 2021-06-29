package co.edu.utp.misiontic2022.c2.chb;
//import java.io.BufferedReader;
//import java.util.Scanner;

//import javax.swing.JOptionPane;

//import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws Exception{

       /* // var sc = new Scanner(System.in);
        System.out.println("Por favor ingrese un número entero");

        var input = new BufferedReader(new InputStreamReader(System.in));
        var entrada = input.readLine();

        var num = Integer.parseInt(entrada);

        System.out.printf("El número tiene %d cifras\n", numeroDigitos(num));
        input.close(); */

      /*  var entrada = JOptionPane.showInputDialog(null, "Por favor ingrese un número");
        var num = Integer.parseInt(entrada);

        JOptionPane.showMessageDialog(null, String.format("El número tiene %d cifras\n"), numeroDigitos(num)); */
    }

   /* public static String saludo(String nombre){
        return "Hola " + nombre + "!";
    } */
    
    public static int numeroDigitos(int num){
        var contador = 0;

        while (num != 0) {
            num /= 10;
            contador++;
        }
        return contador;
    }

}
