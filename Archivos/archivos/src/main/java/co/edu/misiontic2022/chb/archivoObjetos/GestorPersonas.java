package co.edu.misiontic2022.chb.archivoObjetos;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GestorPersonas {
    
    public void guardarPersonas(String archivo, List<Persona> personas){
        
        try {
            var oos = new ObjectOutputStream(new FileOutputStream(archivo));

            for (Persona persona : personas) {
                oos.writeObject(persona);
            }
            oos.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public List<Persona> cargarPersonas(String archivo){

        List<Persona> personas = new ArrayList<>();
        Persona persona;
        try {
            var ois = new ObjectInputStream(new FileInputStream(archivo));
            while ((persona = (Persona) ois.readObject()) != null) {
                personas.add(persona);
            }
            ois.close();
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        } catch (IOException e){
            
        }
        return personas;
    }
}
