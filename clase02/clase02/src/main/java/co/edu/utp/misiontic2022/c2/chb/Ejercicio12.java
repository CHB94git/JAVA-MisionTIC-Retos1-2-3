package co.edu.utp.misiontic2022.c2.chb;

public class Ejercicio12 {

    public static void main(String[] args) {
        /*
         * Realizar programa que muestre los números del 1 al 100 que no sean múltiplos
         * de 3 utilizando cada una las instrucciones repetitivas while do while for
         */
        System.out.println("*** PROGRAMA PARA DETERMINAR LOS NO MÚLTIPLOS DE 3 ENTRE 0 Y 100");
        
        //int num = 1;  //Inicialización variable para ciclos Do While y While

        // Solución mediante While
        /*
          while (num <= 100) {
          
          if (num % 3 == 0 ) {
          
          } else { System.out.println(num + " NO es múltiplo de 3"); } num++; }
         */

        // Solución mediante DO While

        /*
          do{ 
              if (num % 3 == 0 ) {
          
          } else { System.out.println(num + " NO es múltiplo de 3"); } num++;
          
          }while (num <= 100);
         */

        // Solución mediante For
        
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 ) {
                
            } else {
                System.out.println(i + " NO es múltiplo de 3");
            }
        } 
        
    }
}
