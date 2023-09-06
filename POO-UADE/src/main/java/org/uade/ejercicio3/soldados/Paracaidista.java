package org.uade.ejercicio3.soldados;

import org.uade.ejercicio3.MedioCombate;

public class Paracaidista extends MedioCombate  implements ISoldado {

    private final int poderDeCombate = 2;
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

    }
}
