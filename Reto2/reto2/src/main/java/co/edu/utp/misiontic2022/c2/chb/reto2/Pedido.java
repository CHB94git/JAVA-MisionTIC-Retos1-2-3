package co.edu.utp.misiontic2022.c2.chb.reto2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    
    private Date fecha;
    private String cliente;
    private List<Vehiculo> vehiculos;

    //Constructor
    public Pedido(Date fecha, String cliente) {
        this.fecha = fecha;
        this.cliente = cliente;
        vehiculos = new ArrayList<>();
    }

    public void adicionarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

    public Integer calcularCantidadVehiculos(){
        return vehiculos.size();
    }

    public Double calcularSubtotal(){
        double subtotal = 0d;

        for (Vehiculo vehiculo : vehiculos) {
            subtotal += vehiculo.calcularPrecio();
        }
        return subtotal;
    }

    public double calcularDescuentos(){
        double descuento = 0d;

        for (Vehiculo vehiculo : vehiculos) {
            descuento += vehiculo.calcularDescuento(fecha);
        }
        return descuento;
    }

    public double calcularImpuestos(){
        
        double impuestos = 0d;

        for (Vehiculo vehiculo : vehiculos) {
            var valorImpuesto = vehiculo.calcularPrecio() - vehiculo.calcularDescuento(fecha);
            valorImpuesto *= vehiculo.calcularPorcentaje() / 100;
            impuestos += valorImpuesto;
        }
        return impuestos;
    }

    public double calcularTotal(){
        return calcularSubtotal() - calcularDescuentos() + calcularImpuestos();
    }

    public String getCliente() {
        return cliente;
    }

    public Date getFecha() {
        return fecha;
    }
}
