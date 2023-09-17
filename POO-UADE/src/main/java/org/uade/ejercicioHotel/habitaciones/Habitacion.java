package org.uade.ejercicioHotel.habitaciones;

import org.uade.ejercicioHotel.enums.Estado;
import org.uade.ejercicioHotel.enums.PrecioHabitacion;

public abstract class Habitacion {
    private int numero;
    private int piso;
    private String nombre;
    private double precio;
    private Estado estado;

    public Habitacion(double precio,String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public Estado getEstado() {
        return estado;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumero() {
        return numero;
    }
    public int getPiso() {
        return piso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setPrecio(PrecioHabitacion precio) {
        this.precio = precio.ordinal();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
