package co.edu.utp.misiontic2022.c2.chb.reto2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Vehiculo {
    
    private String marca;
    private String modelo;
    private double precioBase;

    //Constructor
    public Vehiculo(String marca, String modelo, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    public abstract double calcularPrecio();

    public abstract double calcularPorcentaje();

    public double calcularDescuento(Date fecha){

        var cal = GregorianCalendar.getInstance();
        cal.setTime(fecha);

        var mes = cal.get(Calendar.MONTH);

        var porcentajeDescuento = 0d;

        if (mes == Calendar.JULY && marca.equals("BMW")) {
            porcentajeDescuento = 15;
        } else if (mes == Calendar.JUNE && marca.equals("Suzuki")){

            if (this instanceof Motocicleta) {
                porcentajeDescuento = 5;
            } else if (this instanceof Automovil){
                porcentajeDescuento = 10;
            }
        }
        return calcularPrecio() * (porcentajeDescuento / 100);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecioBase() {
        return precioBase;
    }
}
