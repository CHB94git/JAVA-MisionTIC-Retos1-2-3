package co.edu.misiontic2022.chb.archivoObjetos;

import java.io.Serializable;

public class Persona implements Serializable {
    
    private Long cedula;
    private String nombres;
    private String apellidos;
    private Integer edad;

    public Persona(Long cedula, String nombres, String apellidos, Integer edad) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [apellidos=" + apellidos + ", cedula=" + cedula + ", edad=" + edad + ", nombres=" + nombres
                + "]";
    }

    
}
