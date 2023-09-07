package org.uade.ejercicio3;

public class Ejercito implements IMedio {
    private String color;

    private MedioCombate[] medioCombates;
    private double poderTotal;

    public Ejercito(String color, MedioCombate medioCombate1, MedioCombate medioCombate2, MedioCombate medioCombate3) {
        this.color = color;
        this.medioCombates = new MedioCombate[3];
        this.medioCombates[0] = medioCombate1;
        this.medioCombates[1] = medioCombate2;
        this.medioCombates[2] = medioCombate3;
    }

    @Override
    public double getPoderTotal() {
        double poderTotal = medioCombates[0].getPoderCombate() + medioCombates[1].getPoderCombate()
                + medioCombates[2].getPoderCombate();

        return poderTotal;
    }
    public String getColor() {
        return color;
    }
}
