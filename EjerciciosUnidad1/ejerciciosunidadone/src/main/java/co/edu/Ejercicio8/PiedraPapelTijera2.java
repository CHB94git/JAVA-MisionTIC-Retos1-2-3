package co.edu.Ejercicio8;

import java.util.Scanner;

public class PiedraPapelTijera2 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String jugador1, jugador2;
        boolean jugar;
        do{
            System.out.println("PIEDRA PAPEL TIJERA\n");
            System.out.println("\nINTRODUCE OPCION JUGADOR 1: P/L/T\n");
            jugador1=teclado.next();
            System.out.println("\nINTRODUCE OPCION JUGADOR 2: P/L/T\n");
            jugador2=teclado.next();
            jugar=true;
            if(jugador1.equals("P") && jugador2.equals("P")) {
                System.out.println("\nEMPATE\n");
                jugar=false;
            }
            if(jugador1.equals("P") && jugador2.equals("L")) {
                System.out.println("\nGANA JUGADOR 2\n");
                jugar=false;
            }
            if(jugador1.equals("P") && jugador2.equals("T")) {
                System.out.println("\nGANA JUGADOR 1\n");
                jugar=false;
            }
            if(jugador1.equals("L") && jugador2.equals("P")) {
                System.out.println("\nGANA JUGADOR 1\n");
                jugar=false;
            }
            if(jugador1.equals("L") && jugador2.equals("L")) {
                System.out.println("\nEMPATE\n");
                jugar=false;
            }
            if(jugador1.equals("L") && jugador2.equals("T")) {
                System.out.println("\nGANA JUGADOR 2\n");
                jugar=false;
            }
            if(jugador1.equals("T") && jugador2.equals("P")) {
                System.out.println("\nGANA JUGADOR 2\n");
                jugar=false;
            }
            if(jugador1.equals("T") && jugador2.equals("L")) {
                System.out.println("\nGANA JUGADOR 1\n");
                jugar=false;
            }
            if(jugador1.equals("T") && jugador2.equals("T")) {
                System.out.println("\nEMPATE\n");
                jugar=false;
            }
        }while(jugar==false);	
        teclado.close();	
    } 
}
