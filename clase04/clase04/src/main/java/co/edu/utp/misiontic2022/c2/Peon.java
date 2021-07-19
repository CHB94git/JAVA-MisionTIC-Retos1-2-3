package co.edu.utp.misiontic2022.c2;

public class Peon extends Ficha {
    

    public Peon(String color) {
        super(color);
    }

    public Boolean comer(){
        return true;
    }

    public Boolean coronar(){
        return true;
    }

    public Boolean mover(){
        return true;
    }

    @Override
    public Boolean mover(Casilla casilla) {
        // TODO Auto-generated method stub
        return null;
    }
}
