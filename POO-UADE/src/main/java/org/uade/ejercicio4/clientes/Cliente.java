package org.uade.ejercicio4.clientes;

import org.uade.ejercicio4.Reservas.Reserva;
import org.uade.ejercicio4.enums.TipoCliente;

public class Cliente {

    private final int id;

    private String nombre;

    private String Apellido;

    private TipoCliente tipo;

    private Reserva[] reservas;
    public Cliente(int id, String nombre, String apellido, TipoCliente tipo) {
        this.id = id;
        this.nombre = nombre;
        Apellido = apellido;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public Reserva[] getReservas() {
        return reservas;
    }

    public String getApellido() {
        return Apellido;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setReservas(Reserva[] reservas) {
        this.reservas = reservas;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

}
