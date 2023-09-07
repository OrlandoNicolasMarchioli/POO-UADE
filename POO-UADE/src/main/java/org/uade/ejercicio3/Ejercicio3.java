package org.uade.ejercicio3;

import org.uade.ejercicio3.soldados.Comando;
import org.uade.ejercicio3.soldados.Paracaidista;
import org.uade.ejercicio3.soldados.Soldado;
import org.uade.ejercicio3.vehiculos.Avion;
import org.uade.ejercicio3.vehiculos.Helicoptero;
import org.uade.ejercicio3.vehiculos.Tanque;

public class Ejercicio3 {

    public static void main(String args[]) {

        Ejercito azul=new Ejercito("Azul", new Avion(20.5), new Comando(), new Tanque(12.5));

        Ejercito rojo=new Ejercito("Rojo", new Helicoptero(13.45), new Soldado(), new Paracaidista())
                ;Tablero tablero=new Tablero(azul,rojo);

        tablero.enfrentar(azul,rojo);

        Comando comando = new Comando();
        comando.dispararFusil();
        comando.saltar();
        comando.emboscar();
        Avion avion=new Avion(10.50);
        System.out.println(avion.getCantidadDeCombustible());

        Tanque tanque=new Tanque(12.00);
        System.out.println(tanque.getCantidadDeCombustible());
    }

}
