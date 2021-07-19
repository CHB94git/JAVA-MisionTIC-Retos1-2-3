package co.edu.utp.misiontic2022.c2;

public class Rey extends Ficha{
   
    public Rey(String color){
        super(color);
    }

    public Boolean mover(){
        this.getColor();
        return true;
    }

    @Override
    public Boolean mover(Casilla casilla) {
        // TODO Auto-generated method stub
        return null;
    }
}
