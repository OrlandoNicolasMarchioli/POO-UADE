package org.uade.ejercicioInstituto;

import org.uade.ejercicioInstituto.academico.Alumno;
import org.uade.ejercicioInstituto.academico.Profesor;
import org.uade.ejercicioInstituto.carrera.Carrera;
import org.uade.ejercicioInstituto.curso.Curso;
import org.uade.ejercicioInstituto.curso.Turno;
import org.uade.ejercicioInstituto.materia.Materia;

import java.util.*;

public class Ejercicio5 {

    public static void main(String[] args) {
        List<Carrera> carreras = new ArrayList<>();
        List<Profesor> profesores = new ArrayList<>();
        List<Alumno> alumnos = new ArrayList<>();
        List<Curso> cursos = new ArrayList<>();
        Materia materia = new Materia();
        List<Materia> materias = materia.juntarMaterias();

        Carrera ingenieria = new Carrera("Ingeniería", materia.generarMateriasIngenieria());
        Carrera letras = new Carrera("Letras", materia.generarMateriasLetras());
        Carrera sistemasInformaticos = new Carrera("Sistemas Informáticos", materia.generarMateriasInformatica());
        Carrera biologiaMarina = new Carrera("Biología Marina", materia.generarMateriasBiologia());

        carreras.add(ingenieria);
        carreras.add(letras);
        carreras.add(sistemasInformaticos);
        carreras.add(biologiaMarina);

        Instituto instituto = new Instituto(carreras, profesores, alumnos, cursos);

        // Generaro 30 ingresos de alumnos
        for (int i = 1; i <= 30; i++) {
            String nombreAlumno = "Alumno" + i;
            String tipoDocumento = "DNI";
            int numeroDocumento = 1000 + i;
            instituto.inscribirAlumno(nombreAlumno, tipoDocumento, numeroDocumento);
        }

        // Genero 10 ingresos de profesores
        for (int i = 1; i <= 10; i++) {
            String nombreProfesor = "Profesor" + i;
            Map<String, List<Turno>> disponibilidad = new HashMap<>();
            List<Materia> materiasDictadas = new ArrayList<>();
            materiasDictadas.add(materias.get(i - 1));
            materiasDictadas.add(materias.get(i % materias.size()));

            instituto.inscribirProfesor(nombreProfesor, disponibilidad, materiasDictadas);
        }

        instituto.generarCurso("biologia 1",instituto.buscarMateriaPorNombre("biologia"),profesores.get(0),alumnos.subList(0,10),ingenieria,"miercoles",Turno.Noche);
        instituto.generarCurso("ecologia 1",instituto.buscarMateriaPorNombre("ecologia"),profesores.get(3),alumnos.subList(15,25),biologiaMarina,"viernes",Turno.Noche);
        instituto.imprimirListadoCurso(instituto.getCursos().get(0));
        instituto.inscribirAlumnoEnCurso(15,1);


    }
}
