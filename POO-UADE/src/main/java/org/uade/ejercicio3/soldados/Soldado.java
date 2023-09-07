package org.uade.ejercicio3.soldados;

import org.uade.ejercicio3.MedioCombate;

public class Soldado extends MedioCombate {

    private final int poderDeCombate = 1;

    public void dispararFusil() {
        System.out.println("Dispara fusil");;
    }

    @Override
    public double getPoderTotal() {
        return 0;
    }

}
