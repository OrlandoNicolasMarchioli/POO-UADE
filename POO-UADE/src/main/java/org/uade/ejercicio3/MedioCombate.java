package org.uade.ejercicio3;

public abstract class MedioCombate implements IMedio {
    public int getPoderCombate() {
        return (int) Math.round(this.getPoderTotal());
    }
}
