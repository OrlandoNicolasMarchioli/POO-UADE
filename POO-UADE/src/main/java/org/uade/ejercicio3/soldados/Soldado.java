package org.uade.ejercicio3.soldados;

import org.uade.ejercicio3.MedioCombate;

public class Soldado extends MedioCombate implements ISoldado {

    private final int poderDeCombate = 1;

    @Override
    public void dispararFusil() {
        System.out.println("Dispara fusil");;
    }

    @Override
    public void saltar() {

    }

    @Override
    public void emboscar() {

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
