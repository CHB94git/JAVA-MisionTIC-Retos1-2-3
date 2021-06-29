package co.edu.utp.misiontic2022.c2.chb.Ejercicio13v2;

import javax.swing.JOptionPane;

public class convertirMoneda {
        public int cantidad;
        public double valorDolar = 3767.50;
        public double result;
        
        public void dolaresAPesos(double cant){
            String.valueOf(valorDolar);
            result = cant * valorDolar;
            JOptionPane.showMessageDialog(null, cant + " USD = " + result + " COP");
        }
        
        public double pesosADolares(double cant){
            result = cant / valorDolar;
            JOptionPane.showMessageDialog(null, cant + " COP = " + result + " USD");
            return result;
        }
}


