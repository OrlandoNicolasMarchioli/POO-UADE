package org.uade.ejercicio3.vehiculos;

import org.uade.ejercicio3.MedioCombate;

public class Helicoptero extends Vehiculo {

    private double cantidadCombustible;
    private double poderCombate;

    public Helicoptero(double cantidadCombustible) {
        super(cantidadCombustible);
        this.poderCombate = 8 * cantidadCombustible + 50;
        this.cantidadCombustible = cantidadCombustible;
    }

    @Override
    public double getPoderTotal() {
        return poderCombate;
    }
    public double getCantidadDeCombustible() {
        return cantidadCombustible;
    }
}

