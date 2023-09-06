package org.uade.ejercicio3.vehiculos;

import org.uade.ejercicio3.MedioCombate;

public class Helicoptero extends MedioCombate {

    private int cantidadCombustible;
    private int poderCombate;

    public Helicoptero(int cantidadCombustible) {
        super();
        this.poderCombate = 8 * cantidadCombustible + 50;
    }

    @Override
    public int getPoderTotal() {
        return 0;
    }

    @Override
    public int setPoderCombate(String modelo) {
        return 0;
    }
}

