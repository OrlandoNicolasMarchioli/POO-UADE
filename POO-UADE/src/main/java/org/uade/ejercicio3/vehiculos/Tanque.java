package org.uade.ejercicio3.vehiculos;

import org.uade.ejercicio3.MedioCombate;

public class Tanque extends MedioCombate {

    private int cantidadCombustible;
    private int poderCombate;

    public Tanque(int cantidadCombustible) {
        super();
        this.poderCombate = 4 * cantidadCombustible;
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
