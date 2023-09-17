package org.uade.ejercicioInstituto;

import org.uade.ejercicioInstituto.academico.Alumno;
import org.uade.ejercicioInstituto.academico.Profesor;
import org.uade.ejercicioInstituto.carrera.Carrera;
import org.uade.ejercicioInstituto.curso.Curso;
import org.uade.ejercicioInstituto.curso.Turno;
import org.uade.ejercicioInstituto.materia.Materia;

import java.util.List;
import java.util.Map;

import static org.uade.ejercicioInstituto.academico.Alumno.nuevoAlumno;
import static org.uade.ejercicioInstituto.curso.Curso.nuevoCurso;

public class Instituto {

    private final int CUPO_MAXIMO = 45;
    private List<Carrera> carreras;
    private List<Profesor> profesores;
    private List<Alumno> alumnos;
    private List<Curso> cursos;

    public Instituto(List<Carrera> carreras, List<Profesor> profesores, List<Alumno> alumnos, List<Curso> cursos) {
        this.carreras = carreras;
        this.profesores = profesores;
        this.alumnos = alumnos;
        this.cursos = cursos;
    }

    public void inscribirAlumno(String nombre, String tipoDoducmento, int numeroDocumento) {
        this.alumnos.add(nuevoAlumno(nombre, tipoDoducmento, numeroDocumento));
        System.out.println("Alumno ingresado exitosamente.");
    }

    public void inscribirProfesor(String nombre, Map<String, List<Turno>> disponibilidad, List<Materia> materiasDictadas) {
        this.profesores.add(Profesor.nuevoProfesor(nombre, disponibilidad, materiasDictadas));
        System.out.println("Profesor ingresado exitosamente.");
    }

    public void inscribirCarrera(String descripcion, List<Materia> materias) {
        carreras.add(new Carrera(descripcion, materias));
    }

    public void imprimirListadoCurso(Curso curso) {
        System.out.println("Curso: " + curso.getNombre());
        System.out.println("Profesor: " + curso.getProfesor().getNombre());

        System.out.println("Alumnos inscritos:");
        for (Alumno alumno : curso.getAlumnos()) {
            System.out.println("- " + alumno.getNombre());
        }
    }

    public boolean cursoExistente(Materia materia, String dia, Turno turno) {
        for (Curso curso : cursos) {
            if (curso.getMateria().equals(materia) && curso.getDia().equals(dia) && curso.getTurno() == turno) {
                return true;
            }
        }
        return false;
    }

    public void generarCurso(String nombreCurso, Materia materia, Profesor profesor, List<Alumno> alumnos, Carrera carrera, String dia, Turno turno) {

        if (!carrera.contieneMateria(materia)) {
            System.out.println("Error: La materia no pertenece a la carrera.");
        }

        if (!profesor.estaDisponible(dia, turno)) {
            System.out.println("Error: El profesor no está disponible en el día y turno especificados.");
        }

        if (cursoExistente(materia, dia, turno)) {
            System.out.println("Error: Ya existe un curso para esta materia en el mismo día y turno.");
        }

        if (alumnos.size() > CUPO_MAXIMO) {
            System.out.println("Error: El curso supera el límite máximo de alumnos " + (CUPO_MAXIMO));
        }

        cursos.add(nuevoCurso(nombreCurso, materia, profesor, alumnos, carrera, dia, turno));
    }

    public void inscribirAlumnoEnCurso(int legajoAlumno, int idCurso) {
        Alumno alumno = getAlumnoPorId(legajoAlumno);
        Curso curso = getCursoPorId(idCurso);
        if (alumno != null && curso != null) {
            List<Alumno> alumnos = curso.getAlumnos();
            if (alumnos.size() == CUPO_MAXIMO) {
                System.out.println("Error: El curso esta completo, no se pueden agregar mas alumnos");
            } else {
                alumnos.add(alumno);
                curso.setAlumnos(alumnos);
            }
        }
        else {
            System.out.println("El curso o el alumno no existen");
        }
    }

    public Alumno getAlumnoPorId(int legajoAlumno){
        for (Alumno alumno: alumnos){
            if(alumno.getLegajo() == legajoAlumno){
                return alumno;
            }
        }
        return null;
    }

    public Curso getCursoPorId(int idCurso){
        for (Curso curso: cursos){
            if(curso.getCodigo() == idCurso){
                return curso;
            }
        }
        return null;
    }

    public Materia buscarMateriaPorNombre(String nombreMateria){
        for (Carrera carrera: carreras) {
            List<Materia> materias = carrera.getMaterias();
            for(Materia materia: materias){
                if(materia.getDescripcion().equals(nombreMateria)){
                    return materia;
                }
            }
        }
        return null;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
}
