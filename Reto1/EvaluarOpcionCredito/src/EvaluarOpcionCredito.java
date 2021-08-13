public class EvaluarOpcionCredito {

    public static void main(String[] args) {

        Double valor = 2051423.32;
        Integer tiempo = 24;

        EvaluarOpcionCredito evaluar = new EvaluarOpcionCredito();

        String eleccion = evaluar.compararOpcion(valor, tiempo);
        System.out.println(eleccion);

    }

    private double calcularInteresSimple(Double valor, Integer tiempo, Double interes) {
        // interes = 3.0;
        double interesSimple;
        double interesEsp = interes / 100;

        interesSimple = valor * interesEsp * tiempo;

        return interesSimple;
    }

    private double calcularInteresCompuesto(Double valor, Integer tiempo, Double interes) {
        // interes = 2.6;
        double TMV = interes / 100;
        double interesCompuesto;

        interesCompuesto = valor * (Math.pow(1 + TMV, tiempo) - 1);

        return interesCompuesto;
    }

    public String compararOpcion(Double valor, Integer tiempo) {

        double simple = calcularInteresSimple(valor, tiempo, 3.0);
        double compuesto = calcularInteresCompuesto(valor, tiempo, 2.6);
        String salida1 = "credito especial";
        String salida2 = "credito libre inversion";

        // System.out.println(simple);
        // System.out.println(compuesto);

        if (simple < compuesto) {
            return salida1;
        }
        if (simple == compuesto) {
            return salida1;
        } else {
            return salida2;
        }
    }
}

