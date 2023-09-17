package org.uade.ejercicioInstituto.academico;

public class Academico {
    static int contador;

    public Academico() {
        contador++;
    }

    public static int getContador() {
        return contador;
    }
}
