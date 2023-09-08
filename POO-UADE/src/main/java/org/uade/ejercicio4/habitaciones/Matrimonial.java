package org.uade.ejercicio4.habitaciones;

import org.uade.ejercicio4.enums.Estado;
import org.uade.ejercicio4.enums.PrecioHabitacion;

public class Matrimonial extends Habitacion{

    private final double PRECIO_MATRIMONIAL = 1500;
    private String nombre;

    private double precio;

    public Matrimonial() {
        super(1500,"Habitacion matrimonial");
        this.precio = PRECIO_MATRIMONIAL;
        this.nombre = getNombre();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
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
    public double getPrecio() {
        return super.getPrecio();
    }

    @Override
    public int getPiso() {
        return super.getPiso();
    }



}
