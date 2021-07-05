public class Ejercicio1 {

    /*
     * Implemente un algoritmo que dado un nombre en una variable de tipo cadena,
     * imprima un saludo en consola
     */

    public static void main(String[] args) {
        var nombre = "Cristian Hernandez";

        var resultado = saludo(nombre);

        System.out.println(resultado);
    }

    public static String saludo(String nombre) {
        return "Hola " + nombre + "!";
    }
}
