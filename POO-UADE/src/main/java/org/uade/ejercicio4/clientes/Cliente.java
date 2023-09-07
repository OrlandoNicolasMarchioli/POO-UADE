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
}
