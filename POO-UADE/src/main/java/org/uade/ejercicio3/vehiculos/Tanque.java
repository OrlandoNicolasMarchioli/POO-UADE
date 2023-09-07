package org.uade.ejercicio3.vehiculos;

import org.uade.ejercicio3.MedioCombate;

public class Tanque extends Vehiculo {

    private double cantidadCombustible;
    private double poderCombate;

    public Tanque(double cantidadCombustible) {
        super(cantidadCombustible);
        this.poderCombate = 4 * cantidadCombustible;
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
