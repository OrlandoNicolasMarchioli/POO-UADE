package org.uade.ejercicioInstituto.curso;

import org.uade.ejercicioInstituto.academico.Alumno;
import org.uade.ejercicioInstituto.academico.Profesor;
import org.uade.ejercicioInstituto.carrera.Carrera;
import org.uade.ejercicioInstituto.materia.Materia;

import java.util.List;

public class Curso {
    private int codigo;
    private static int contador = 0;
    private String nombre;
    private Materia materia;
    private Profesor profesor;
    private List<Alumno> alumnos;
    private Carrera carrera;
    private String dia;
    private Turno turno;

    public Curso(String nombre, Materia materia, Profesor profesor, List<Alumno> alumnos, Carrera carrera, String dia, Turno turno) {
        contador++;
        this.codigo = contador;
        this.nombre = nombre;
        this.materia = materia;
        this.profesor = profesor;
        this.alumnos = alumnos;
        this.carrera = carrera;
        this.dia = dia;
        this.turno = turno;
    }

    public static Curso nuevoCurso(String nombre, Materia materia, Profesor profesor, List<Alumno> alumnos, Carrera carrera, String dia, Turno turno) {
        return new Curso(nombre, materia, profesor, alumnos, carrera, dia, turno);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Materia getMateria() {
        return materia;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public String getDia() {
        return dia;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}
