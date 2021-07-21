package co.edu.misiontic2022.chb;

import java.util.Arrays;
import java.util.List;

import co.edu.misiontic2022.chb.archivoObjetos.GestorPersonas;
import co.edu.misiontic2022.chb.archivoObjetos.Persona;
import co.edu.misiontic2022.chb.archivoTexto.EscribirArchivo;
import co.edu.misiontic2022.chb.archivoTexto.LeerArchivo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Entrada1.ejecutar();
        //Entrada2.ejecutar();
        //Entrada3.ejecutar();

        //var archivo = new EscribirArchivo();
        //archivo.escribir("numeros.txt");

        //var leer = new LeerArchivo();
        //leer.readFiles("numeros.txt");

        var gp = new GestorPersonas();
        gp.guardarPersonas("Personas.obj", 
            Arrays.asList(
                new Persona(12345L, "Carolina", "Jacome", 24),
                new Persona(1455678L, "Cristian", "Hernandez", 26),
                new Persona(1784878L, "Hebert", "Torres", 32)
            ));
            List<Persona> personas = gp.cargarPersonas("Personas.obj");
            personas.forEach(System.out::println);
    }
}
