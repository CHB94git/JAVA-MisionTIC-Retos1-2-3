package co.edu.Ejercicio8;

import java.io.IOException;
import java.util.Scanner;

public class PiedraPapelTijera2 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String jugador1, jugador2;
        char caracter;
        do {
            System.out.println("*** JUEGO DE PIEDRA PAPEL TIJERA\n");
            System.out.println("\nINTRODUCE OPCIÓN JUGADOR 1: P = PIEDRA/L = PAPEL/T = TIJERA\n");
            jugador1 = sc.next();
            System.out.println("\nINTRODUCE OPCIÓN JUGADOR 2: P = PIEDRA/L = PAPEL/T = TIJERA\n");
            jugador2 = sc.next();

            if (jugador1.equals("P") && jugador2.equals("P")) {
                System.out.println("\nEMPATE\n");

            }
            if (jugador1.equals("P") && jugador2.equals("L")) {
                System.out.println("\nGANA JUGADOR 2\n");

            }
            if (jugador1.equals("P") && jugador2.equals("T")) {
                System.out.println("\nGANA JUGADOR 1\n");

            }
            if (jugador1.equals("L") && jugador2.equals("P")) {
                System.out.println("\nGANA JUGADOR 1\n");

            }
            if (jugador1.equals("L") && jugador2.equals("L")) {
                System.out.println("\nEMPATE\n");

            }
            if (jugador1.equals("L") && jugador2.equals("T")) {
                System.out.println("\nGANA JUGADOR 2\n");

            }
            if (jugador1.equals("T") && jugador2.equals("P")) {
                System.out.println("\nGANA JUGADOR 2\n");

            }
            if (jugador1.equals("T") && jugador2.equals("L")) {
                System.out.println("\nGANA JUGADOR 1\n");

            }
            if (jugador1.equals("T") && jugador2.equals("T")) {
                System.out.println("\nEMPATE\n");

            }
            System.out.print("Desea jugar de nuevo? (S/N): ");
            caracter = (char) System.in.read();

        } while (caracter == 'S' || caracter == 's');

        sc.close();
    }
}
