package org.uade.ejercicio3.soldados;

import org.uade.ejercicio3.MedioCombate;

public class Comando extends Paracaidista {

    private final int poderDeCombate = 3;
    @Override
    public void dispararFusil() {
        System.out.println("Dispara fusil");;
    }

    @Override
    public void saltar() {
        System.out.println("Salta de un avión");;
    }
    public void emboscar() {
        System.out.println("Hace una emboscada");;
    }

    @Override
    public double getPoderTotal() {
        return 0;
    }


}
