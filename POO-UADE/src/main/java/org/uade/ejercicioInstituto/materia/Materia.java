package org.uade.ejercicioInstituto.materia;

import java.util.ArrayList;
import java.util.List;

public class Materia {

    private int codigo;

    private static int contador = 0;

    private String descripcion;

    public Materia() {
    }

    public Materia(String descripcion) {
        contador++;
        this.codigo = contador;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public List<Materia> juntarMaterias(){
        List<Materia> totalMaterias = new ArrayList<>();
        totalMaterias.addAll(generarMateriasBiologia());
        totalMaterias.addAll(generarMateriasIngenieria());
        totalMaterias.addAll(generarMateriasLetras());
        totalMaterias.addAll(generarMateriasInformatica());
        return totalMaterias;
    }
    public List<Materia> generarMateriasIngenieria(){
        List<Materia> materiasIngenieria = new ArrayList<>();
        materiasIngenieria.add(new Materia("matematica"));
        materiasIngenieria.add(new Materia("fisica"));
        materiasIngenieria.add(new Materia("quimica"));
        materiasIngenieria.add(new Materia("programacion"));
        materiasIngenieria.add(new Materia("estadistica"));
        materiasIngenieria.add(new Materia("economia"));
        materiasIngenieria.add(new Materia("ingles"));
        materiasIngenieria.add(new Materia("arquitectura"));
        materiasIngenieria.add(new Materia("contabilidad"));
        materiasIngenieria.add(new Materia("marketing"));
        materiasIngenieria.add(new Materia("ecologia"));
        return materiasIngenieria;
    }

    public List<Materia> generarMateriasLetras(){
        List<Materia> materiasLetras = new ArrayList<>();
        materiasLetras.add(new Materia("literatura"));
        materiasLetras.add(new Materia("historia"));
        materiasLetras.add(new Materia("filosofia"));
        materiasLetras.add(new Materia("ingles"));
        materiasLetras.add(new Materia("psicologia"));
        materiasLetras.add(new Materia("sociologia"));
        return materiasLetras;
    }

    public List<Materia> generarMateriasInformatica(){
        List<Materia> materiasInformatica = new ArrayList<>();
        materiasInformatica.add(new Materia("informatica"));
        materiasInformatica.add(new Materia("matematica"));
        materiasInformatica.add(new Materia("ingles"));
        materiasInformatica.add(new Materia("programacion"));
        materiasInformatica.add(new Materia("estadistica"));
        materiasInformatica.add(new Materia("sociologia"));
        materiasInformatica.add(new Materia("filosofia"));
        materiasInformatica.add(new Materia("psicologia"));
        materiasInformatica.add(new Materia("arte"));
        materiasInformatica.add(new Materia("ecologia"));
        materiasInformatica.add(new Materia("derecho"));
        materiasInformatica.add(new Materia("economia"));
        materiasInformatica.add(new Materia("contabilidad"));
        materiasInformatica.add(new Materia("marketing"));
        materiasInformatica.add(new Materia("geografia"));
        return materiasInformatica;
    }

    public List<Materia> generarMateriasBiologia(){
        List<Materia> materiasBiologia = new ArrayList<>();
        materiasBiologia.add(new Materia("biologia"));
        materiasBiologia.add(new Materia("quimica"));
        materiasBiologia.add(new Materia("anatomia"));
        materiasBiologia.add(new Materia("ecologia"));
        materiasBiologia.add(new Materia("medicina"));
        materiasBiologia.add(new Materia("quimicaOrganica"));
        materiasBiologia.add(new Materia("economia"));
        materiasBiologia.add(new Materia("contabilidad"));
        materiasBiologia.add(new Materia("marketing"));
        materiasBiologia.add(new Materia("geografia"));
        return materiasBiologia;
    }
}
