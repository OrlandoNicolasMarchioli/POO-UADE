package org.uade.ejercicioInstituto.carrera;

import org.uade.ejercicioInstituto.materia.Materia;

import java.util.List;

public class Carrera {
    private int codigo;
    private static int contador = 0;
    private String descripcion;
    private List<Materia> materias;

    public Carrera(String descripcion, List<Materia> materias) {
        contador++;
        this.codigo = contador;
        this.descripcion = descripcion;
        this.materias = materias;
    }

    public Carrera generarCarrera(String descripcion, List<Materia> materias){
        return new Carrera(descripcion,materias);
    }

    public boolean contieneMateria(Materia materia){
        return materias.contains(materia);
    }

    public int getCodigo() {
        return codigo;
    }

    public static int getContador() {
        return contador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Materia> getMaterias() {
        return materias;
    }
}
