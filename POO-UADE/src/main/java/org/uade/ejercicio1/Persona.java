package org.uade.ejercicio1;

public class Persona {

    private String apellido;

    private String nombre;

    private final int DNI;

    public Persona(String apellido, String nombre, int DNI) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }
}
