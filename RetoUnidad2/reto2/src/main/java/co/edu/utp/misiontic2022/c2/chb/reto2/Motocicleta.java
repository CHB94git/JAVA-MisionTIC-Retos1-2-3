package co.edu.utp.misiontic2022.c2.chb.reto2;

public class Motocicleta extends Vehiculo {
    
    private Integer cilindraje;

    public Motocicleta(String marca, String modelo, double precioBase, Integer cilindraje) {
        super(marca, modelo, precioBase);
        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularPrecio() {
        double precio = getPrecioBase();

        if (cilindraje >= 200 && cilindraje <= 350) {
            precio += 500000d;
        }
        if (cilindraje >= 351 && cilindraje <= 500) {
            precio += 750000d;
        }
        if (cilindraje > 500) {
            precio += 1000000d;
        }
        return precio;
    }

    @Override
    public double calcularPorcentaje() {
        
        var porcentajeImpuestos = calcularPrecio();
        return (porcentajeImpuestos > 7_500_000d ? 10d : 0d);
    }
}
