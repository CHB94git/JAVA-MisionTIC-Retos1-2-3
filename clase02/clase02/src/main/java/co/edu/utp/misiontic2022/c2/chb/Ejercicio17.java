package co.edu.utp.misiontic2022.c2.chb;

public class Ejercicio17 {

    public static void main(String[] args) {

        
        /* *** PROGRAMA CONTADOR DE 5 DÍGITOS, REEMPLAZA EL 3 POR "E" *** */

        
        // Solución Usando el ciclo While
        
        /*
        int i = 0;
        while (i <= 9) {
            int i2 = 0;
            while (i2 <= 9) {
                int i3 = 0;
                while (i3 <= 9) {
                    int i4 = 0;
                    while (i4 <= 9) {
                        int i5 = 0;
                        while (i5 <= 9) {
                            System.out.print(i == 3 ? "E" : i);
                            System.out.print(i2 == 3 ? "E" : i2);
                            System.out.print(i3 == 3 ? "E" : i3);
                            System.out.print(i4 == 3 ? "E" : i4);
                            System.out.println(i5 == 3 ? "E" : i5);
                            i5++;
                        }
                        i4++;
                    }
                    i3++;
                }
                i2++;
            }
            i++;
        }
        */

        // Solución Usando el ciclo For

        for (int pDigit = 0; pDigit <= 9; pDigit++) {
            for (int sDigit = 0; sDigit <= 9; sDigit++) {
                for (int tDigit = 0; tDigit <= 9; tDigit++) {
                    for (int cDigit = 0; cDigit <= 9; cDigit++) {
                        for (int qDigit = 0; qDigit <= 9; qDigit++) {
                            System.out.print(pDigit == 3 ? "E" : pDigit);
                            System.out.print(sDigit == 3 ? "E" : sDigit);
                            System.out.print(tDigit == 3 ? "E" : tDigit);
                            System.out.print(cDigit == 3 ? "E" : cDigit);
                            System.out.println(qDigit == 3 ? "E" : qDigit);
                        }
                    }
                }
            }
        }
    }
}
