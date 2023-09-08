package org.uade.ejercicio4.habitaciones;

import org.uade.ejercicio4.enums.Estado;
import org.uade.ejercicio4.enums.PrecioHabitacion;

public class Doble extends Habitacion{

    private final double PRECIO_DOBLE = 1000;

    private double precio;
    private String nombre;

    public Doble() {
        super(1000,"Habitacion doble");
        this.precio = PRECIO_DOBLE;
        this.nombre = getNombre();
    }

    @Override
    public double getPrecio() {
        return super.getPrecio();
    }

    @Override
    public Estado getEstado() {
        return super.getEstado();
    }

    @Override
    public int getNumero() {
        return super.getNumero();
    }

    @Override
    public int getPiso() {
        return super.getPiso();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }
}
