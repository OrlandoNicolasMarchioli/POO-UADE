package org.uade.ejercicioInstituto.academico;
import org.uade.ejercicioInstituto.curso.Turno;
import org.uade.ejercicioInstituto.materia.Materia;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Profesor extends Academico{
    private final int legajo;
    private String nombre;
    private Map<String,List<Turno>> disponibilidad;

    private List<Materia> materiasDictadas;

    public Profesor(String nombre, Map<String, List<Turno>> disponibilidad, List<Materia> materiasDictadas) {
        super();
        this.legajo = getContador();
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
        this.materiasDictadas = materiasDictadas;
        asignarDisponibilidadAleatoria();
    }

    public Profesor(String nombre, List<Materia> materiasDictadas) {
        super();
        this.legajo = getContador();
        this.nombre = nombre;
        this.materiasDictadas = materiasDictadas;
    }

    public boolean estaDisponible(String dia, Turno turno) {

        if (disponibilidad.containsKey(dia)) {
            List<Turno> turnosDisponibles = disponibilidad.get(dia);

            if (turnosDisponibles.contains(turno)) {
                return true;
            }
        }
        return false;
    }

    private void asignarDisponibilidadAleatoria() {
        String[] diasDisponibles = {"lunes", "martes", "miércoles", "jueves", "viernes"};
        Turno[] turnosDisponibles = {Turno.Manana, Turno.Tarde, Turno.Noche};

        Random random = new Random();

        for (String dia : diasDisponibles) {
            List<Turno> turnos = new ArrayList<>();
            // Asigna aleatoriamente un turno a este día
            int indiceTurnoAleatorio = random.nextInt(turnosDisponibles.length);
            Turno turnoAleatorio = turnosDisponibles[indiceTurnoAleatorio];
            turnos.add(turnoAleatorio);
            disponibilidad.put(dia, turnos);
        }
    }

    public void agregarDisponibilidad(String dia, Turno turno) {

        if (disponibilidad.containsKey(dia)) {
            List<Turno> turnosDisponibles = disponibilidad.get(dia);

            if (!turnosDisponibles.contains(turno)) {
                turnosDisponibles.add(turno);
            }
        } else {

            List<Turno> nuevosTurnos = new ArrayList<>();
            nuevosTurnos.add(turno);
            disponibilidad.put(dia, nuevosTurnos);
        }
    }

    public static Profesor nuevoProfesor(String nombre, Map<String, List<Turno>> disponibilidad, List<Materia> materiasDictadas){
        return new Profesor(nombre,disponibilidad,materiasDictadas);
    }

    public static Profesor nuevoProfesor(String nombre, List<Materia> materiasDictadas){
        return new Profesor(nombre,materiasDictadas);
    }

    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDisponibilidad(Map<String, List<Turno>> disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Map<String, List<Turno>> getDisponibilidad() {
        return disponibilidad;
    }

    public List<Materia> getMateriasDictadas() {
        return materiasDictadas;
    }
}
