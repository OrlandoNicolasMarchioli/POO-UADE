package org.uade.ejercicio4.Reservas;

import org.uade.ejercicio4.clientes.Cliente;
import org.uade.ejercicio4.habitaciones.Habitacion;

import java.util.Date;

public class Reserva{

    private int idReserva;

    private Cliente cliente;

    private Habitacion habitacion;

    private Date fechaComienzo;

    private int cantidadDias;

    private double importeTotal;

    private double sena;

    public Reserva(Cliente cliente, Habitacion habitacion, Date fechaComienzo, int cantidadDias, double importeTotal, double sena) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaComienzo = fechaComienzo;
        this.cantidadDias = cantidadDias;
        this.importeTotal = importeTotal;
        this.sena = sena;
    }

    public Reserva(Cliente cliente, Habitacion habitacion, Date fechaComienzo, int cantidadDias, double importeTotal) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaComienzo = fechaComienzo;
        this.cantidadDias = cantidadDias;
        this.importeTotal = importeTotal;
    }

    public Reserva generarReserva(Cliente cliente, Habitacion habitacion, Date fechaComienzo, int cantidadDias, double importeTotal, double sena){
        return new Reserva( cliente,  habitacion,  fechaComienzo,  cantidadDias,  importeTotal,  sena);
    }

    public Reserva generarReserva(Cliente cliente, Habitacion habitacion, Date fechaComienzo, int cantidadDias, double importeTotal){
        return new Reserva( cliente,  habitacion,  fechaComienzo,  cantidadDias,  importeTotal);
    }

    public void cancelarReserva(Cliente cliente,Habitacion habitacion,Reserva reserva){

    }
}
