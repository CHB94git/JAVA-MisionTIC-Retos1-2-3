package co.edu.utp.misiontic2022.c2;

public class Casilla {

    private String color;
    private Integer fila;
    private Integer columna;

    private Ficha ficha;

    public Casilla(Integer fila, Integer columna) {

        this.fila = fila;
        this.columna = columna;
        //this.color = calcularColor();
        //this.color = fila % 2 == 0 ? (columna % 2 == 0 ? "blanco" : "negro") : (columna % 2 != 0 ? "blanco" : "negro");
        this.color = (fila % 2 == 0 && columna % 2 == 0) || (fila % 2 != 0 && columna % 2 != 0) ? "blanco" : "negro";
    }

   /* private String calcularColor() {

        if ((fila % 2 == 0 && columna % 2 == 0) || (fila % 2 != 0 && columna % 2 != 0)) {
            return "blanco";
        }
        return "negro";
    } */

    public Boolean estaOcupado() {
        return ficha != null;
    }

    public Boolean esContrincante(String color){
        return ficha.getColor().equals(color);
    }

    public void posicionarFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    public void retirarFicha() {
        this.ficha = null;
    }

    @Override
    public String toString() {
        return "Casilla [color=" + color + ", columna=" + columna;
    }
}
