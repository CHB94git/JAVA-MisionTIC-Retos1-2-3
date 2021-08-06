package co.edu.utp.misiontic2022.c2.chb.reto2;

public class Automovil extends Vehiculo{

    private TipoTransmision transmision;
    private Boolean aireAcondicionado;
    private Boolean vidriosElectricos;
    
    
    public Automovil(String marca, String modelo, double precioBase, TipoTransmision transmision,
            Boolean aireAcondicionado, Boolean vidriosElectricos) {
        super(marca, modelo, precioBase);
        this.transmision = transmision;
        this.aireAcondicionado = aireAcondicionado;
        this.vidriosElectricos = vidriosElectricos;
    }

    @Override
    public double calcularPrecio() {
        double precio = getPrecioBase();

        if (transmision == TipoTransmision.AUTOMATICA) {
            precio *= ((100 + 5d) / 100);
        }
        if (aireAcondicionado) {
            precio += 3000000d;
        }
        else if(vidriosElectricos){
            precio += 400000d;
        }
        return precio;
    }

    @Override
    public double calcularPorcentaje() {
        var porcentajeImpuestos = calcularPrecio();
        return (porcentajeImpuestos > 60_000_000d ? 10d : 0d);
    }
    
}
