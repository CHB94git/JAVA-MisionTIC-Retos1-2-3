package co.edu.utp.misiontic2022.c2.chb.Ejercicio13v2;

import javax.swing.JOptionPane;

public class Ejercicio13v2main {

    /* Programa que pase de pesos a dólares y viceversa */

    public static void main(String[] args) {

        convertirMoneda change = new convertirMoneda();

        int opcion;
        double cant;

        do {
            opcion = Integer
                    .parseInt(JOptionPane.showInputDialog("Convertidor de Moneda\n\n" + "1: Dólares USD a Pesos COP\n"
                            + "2: Pesos COP a Dólares USD\n" + "3: Salir\n\n" + "Elige un opción"));

            switch (opcion) {
                case 1:
                    cant = Double.parseDouble(JOptionPane.showInputDialog(
                            "Convertir Dólares USD a Pesos COP\n" + "Ingresa la cantidad a convertir"));
                    change.dolaresAPesos(cant);
                    break;
                case 2:
                    cant = Double.parseDouble(JOptionPane.showInputDialog(
                            "Convertir Pesos COP a Dólares USD\n" + "Ingresa la cantidad a convertir"));
                    change.pesosADolares(cant);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Salió del programa", "Salida", opcion);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida", "Error!", opcion);
                    break;
            }
        } while (opcion != 3);

    }

}
