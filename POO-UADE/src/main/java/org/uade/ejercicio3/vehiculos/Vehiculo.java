package org.uade.ejercicio3.vehiculos;

import org.uade.ejercicio3.MedioCombate;

public class Vehiculo extends MedioCombate {

    private double combustible;

    public Vehiculo(double combustible){
        super();
        this.combustible = combustible;
    }
    @Override
    public double getPoderTotal() {
        return this.getPoderCombate();
    }
}
