package org.uade.ejercicio3.vehiculos;

import org.uade.ejercicio3.MedioCombate;

public class Avion extends MedioCombate {

    private int cantidadCombustible;
    private int poderCombate;

    public Avion(int cantidadCombustible) {
        super();
        this.poderCombate = 10 * cantidadCombustible + 100;
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
