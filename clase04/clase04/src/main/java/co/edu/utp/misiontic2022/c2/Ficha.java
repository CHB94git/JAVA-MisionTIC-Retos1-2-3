package co.edu.utp.misiontic2022.c2;

public abstract class Ficha {
    
    private String color;

    public Ficha(String color){
        this.color = color;
    }

    public Boolean comer(Casilla casilla){
        if (casilla.estaOcupado() && casilla.esContrincante(color)) {
            casilla.posicionarFicha(this);
            return true;
        }
        return false;
    }

    public abstract Boolean mover(Casilla casilla);

    public String getColor(){
        return color;
    }
}
