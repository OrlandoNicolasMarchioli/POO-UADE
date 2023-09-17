package org.uade.ejercicioInstituto.academico;

import org.uade.ejercicioInstituto.curso.Curso;

import java.util.Arrays;

public class Alumno extends Academico{
    private final int legajo;
    private String nombre;
    private String tipoDocumento;
    private int numeroDeDocumento;
    private Curso[] cursos;

    public Alumno(String nombre, String tipoDocumento, int numeroDeDocumento) {
        super();
        this.legajo = getContador();
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.numeroDeDocumento = numeroDeDocumento;
    }

    public static Alumno nuevoAlumno(String nombre, String tipoDocumento, int numeroDocumento){
        return new Alumno(nombre,tipoDocumento,numeroDocumento);
    }

    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public int getNumeroDeDocumento() {
        return numeroDeDocumento;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", numeroDeDocumento=" + numeroDeDocumento +
                ", cursos=" + Arrays.toString(cursos) +
                '}';
    }
}
