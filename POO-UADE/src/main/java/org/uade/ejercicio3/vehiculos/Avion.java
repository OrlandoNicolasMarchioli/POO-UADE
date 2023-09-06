package org.uade.ejercicio3.vehiculos;

import org.uade.ejercicio3.MedioCombate;

public class Avion extends Vehiculo {

    private double cantidadCombustible;
    private double poderCombate;

    public Avion(double cantidadCombustible) {
        super(cantidadCombustible);
        this.poderCombate = 10 * cantidadCombustible + 100;
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
