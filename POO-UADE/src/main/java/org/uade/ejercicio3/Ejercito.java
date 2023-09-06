package org.uade.ejercicio3;

import org.uade.ejercicio3.soldados.Comando;
import org.uade.ejercicio3.soldados.Soldado;
import org.uade.ejercicio3.vehiculos.Avion;
import org.uade.ejercicio3.vehiculos.Helicoptero;
import org.uade.ejercicio3.vehiculos.Tanque;

import java.util.List;

public class Ejercito implements IMedioCombate{
    private String color;

    private List<MedioCombate> medioCombates;

    private int poderTotal;

    public Ejercito(String color, MedioCombate medioCombate1, MedioCombate medioCombate2, MedioCombate medioCombate3) {
        this.color = color;
        this.medioCombates.add(medioCombate1);
        this.medioCombates.add(medioCombate2);
        this.medioCombates.add(medioCombate3);
    }

    Ejercito ejercito1 = new Ejercito("verde",new Avion(10),new Tanque(20),new Soldado());
    Ejercito ejercito2 = new Ejercito("azul",new Avion(50),new Tanque(1),new Comando());

    @Override
    public int getPoderTotal() {
        int poderTotal = 0;
        for (int i = 0; i < medioCombates.size(); i++) {
            poderTotal += medioCombates.get(i).getPoderCombate();
        }
        return poderTotal;
    }

    @Override
    public int setPoderCombate(String modelo) {
        return 0;
    }
}
