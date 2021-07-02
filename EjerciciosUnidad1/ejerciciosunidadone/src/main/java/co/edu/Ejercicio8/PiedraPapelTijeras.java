package co.edu.Ejercicio8;

import java.util.Scanner;

public class PiedraPapelTijeras {

    private Usuario usuario1, usuario2;
    
    private enum Movimiento {

        PIEDRA, PAPEL, TIJERAS;

        public int compararMovimientos(Movimiento otroMov) {

            // Empate
            if (this == otroMov)
                return 0;

            switch (this) {
                case PIEDRA:
                    return (otroMov == TIJERAS ? 1 : -1);
                case PAPEL:
                    return (otroMov == PIEDRA ? 1 : -1);
                case TIJERAS:
                    return (otroMov == PAPEL ? 1 : -1);
            }

            return 0;
        }
    }

    private class Usuario {

        private Scanner input;

        public Usuario() {
            input = new Scanner(System.in);
        }

        public Movimiento mov() {

            System.out.print("Elige lo que quieras jugar:\n\npiedra P, p\npapel L, l\ntijeras T, t\n");

            String sc = input.nextLine();
            sc = sc.toUpperCase();
            char letra = sc.charAt(0);

            if (letra == 'P' || letra == 'L' || letra == 'T') {

                switch (letra) {
                    case 'P':
                        return Movimiento.PIEDRA;
                    case 'L':
                        return Movimiento.PAPEL;
                    case 'T':
                        return Movimiento.TIJERAS;
                }
            }

            return mov();
        }

        public boolean jugarDeNuevo() {

            System.out.print("Quieres jugar de nuevo? ");
            System.out.println("Ingresa s para jugar de nuevo!");
            String uSC = input.nextLine();
            uSC = uSC.toUpperCase();
            return uSC.charAt(0) == 'S';
        }
    }

    public PiedraPapelTijeras() {

        usuario1 = new Usuario();
        usuario2 = new Usuario();
    }

    public void iniciarJuego() {

        System.out.println("*** PROGRAMA PARA JUGAR PIEDRA, PAPEL, TIJERAS!");

        System.out.println("\nJugador 1 elige tu jugada:\n ");
        Movimiento usuario1Mov = usuario1.mov();

        System.out.println("\nJugador 2 elige tu jugada:\n ");
        Movimiento usuario2Mov = usuario2.mov();

        System.out.println("\nJugador 1 ha jugado " + usuario1Mov + ".");
        System.out.println("Jugador 2 ha jugado " + usuario2Mov + ".\n");
    
        int comparar = usuario1Mov.compararMovimientos(usuario2Mov);
    
        switch (comparar) {

            case 0: // Empate
                System.out.println("Empate!");
                break;

            case 1: // Gana Usuario1
                System.out.println(usuario1Mov + " le gana a " + usuario2Mov + ", Usuario 1 gana!");
                break;

            case -1: // Gana Usuario2
                System.out.println(usuario2Mov + " le gana a " + usuario1Mov + ", Usuario 2 gana!");
                break;
        }
        
        if (usuario1.jugarDeNuevo()) {
            System.out.println();
            iniciarJuego();
        } 
    }

    public static void main(String[] args) {
        PiedraPapelTijeras juego = new PiedraPapelTijeras();
        juego.iniciarJuego();
    }
}
