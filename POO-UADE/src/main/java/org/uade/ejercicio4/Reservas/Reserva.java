package org.uade.ejercicio4.Reservas;

import org.uade.ejercicio4.clientes.Cliente;
import org.uade.ejercicio4.enums.Estado;
import org.uade.ejercicio4.enums.EstadoReserva;
import org.uade.ejercicio4.enums.TipoCliente;
import org.uade.ejercicio4.habitaciones.Doble;
import org.uade.ejercicio4.habitaciones.Habitacion;
import org.uade.ejercicio4.habitaciones.Matrimonial;
import org.uade.ejercicio4.habitaciones.Simple;

import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Reserva{

    private int idReserva;

    private Cliente cliente;

    private Habitacion habitacion;

    private Date fechaComienzo;

    private int cantidadDias;

    private double importeTotal;

    private double sena;

    private EstadoReserva estadoReserva;

    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);

    public Reserva(Cliente cliente, Habitacion habitacion, Date fechaComienzo, int cantidadDias, double importeTotal, double sena) {
        this.idReserva = ID_GENERATOR.getAndIncrement();
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public EstadoReserva getEstadoReserva() {
        return estadoReserva;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public void setEstadoReserva(EstadoReserva estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public Date getFechaComienzo() {
        return fechaComienzo;
    }

    public void setFechaComienzo(Date fechaComienzo) {
        this.fechaComienzo = fechaComienzo;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public double getSena() {
        return sena;
    }

    public void setSena(double sena) {
        this.sena = sena;
    }

    public static Reserva generarReserva(Cliente cliente, Habitacion habitacion, Date fechaComienzo, int cantidadDias, double importeTotal, double sena){
        return new Reserva( cliente,  habitacion,  fechaComienzo,  cantidadDias,  importeTotal,  sena);
    }

    public static Reserva generarReserva(Cliente cliente, Habitacion habitacion, Date fechaComienzo, int cantidadDias, double importeTotal){
        return new Reserva( cliente,  habitacion,  fechaComienzo,  cantidadDias,  importeTotal);
    }



    public static void cambiarEstadoDeReserva(Reserva reserva, EstadoReserva nuevoEstado){
        reserva.setEstadoReserva(nuevoEstado);
    }

    public static void cancelarReserva(Cliente cliente,Date fechaComienzo,Reserva reserva){
        reserva.setEstadoReserva(EstadoReserva.Cancelada);
    }
    public static Reserva crearReserva(Cliente cliente,Habitacion habitacion,Date fechaComienzo, int cantidadDias, double importeTotal, double sena){
        habitacion.setEstado(Estado.Reservada);
        if(cliente.getTipo().equals(TipoCliente.Habitual)){
             return new Reserva(cliente,habitacion,fechaComienzo,cantidadDias,importeTotal);
        }else{
            return new Reserva(cliente,habitacion,fechaComienzo,cantidadDias,importeTotal,sena);
        }
    }
}
