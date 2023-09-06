package org.uade.ejercicio3.soldados;

import org.uade.ejercicio3.MedioCombate;

public class Comando extends MedioCombate implements ISoldado {

    private final int poderDeCombate = 3;
    @Override
    public void dispararFusil() {
        System.out.println("Dispara fusil");;
    }

    @Override
    public void saltar() {
        System.out.println("Salta de un avión");;
    }

    @Override
    public void emboscar() {
        System.out.println("Hace una emboscada");;
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
