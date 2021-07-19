package co.edu.utp.misiontic2022.c2;

public class Tablero {
    
    private Casilla[] casillas;
    
    //Constructor
    public Tablero(){
        casillas = new Casilla[64];
        for (int i = 0; i < 64; i++) {
            casillas[i] = new Casilla(i / 8, i % 8);

        }
    }

    public Boolean puedeHacerEnroque(){
        return true;
    }

    public Boolean estaEnJaque(){
        return true;
    }

    public Boolean estaEnJaqueMate(){
        return true;
    }
}
