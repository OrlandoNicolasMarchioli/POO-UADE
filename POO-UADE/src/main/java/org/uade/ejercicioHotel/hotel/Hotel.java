package org.uade.ejercicioHotel.hotel;

import org.uade.ejercicioHotel.Reservas.Reserva;
import org.uade.ejercicioHotel.clientes.Cliente;
import org.uade.ejercicioHotel.enums.Descuento;
import org.uade.ejercicioHotel.enums.Estado;
import org.uade.ejercicioHotel.enums.EstadoReserva;
import org.uade.ejercicioHotel.habitaciones.Doble;
import org.uade.ejercicioHotel.habitaciones.Habitacion;
import org.uade.ejercicioHotel.habitaciones.Matrimonial;
import org.uade.ejercicioHotel.habitaciones.Simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static org.uade.ejercicioHotel.Reservas.Reserva.crearReserva;

public class Hotel {

    private Reserva[] reservas;
    private Habitacion[] habitaciones;
    private Cliente[] clientes;

    public Hotel(Reserva[] reservas, Habitacion[] habitaciones, Cliente[] clientes) {
        this.reservas = reservas;
        this.habitaciones = habitaciones;
        this.clientes = clientes;
    }

    // Función para ver habitaciones disponibles por tipo para una fecha determinada
    public List<Habitacion> verHabitacionesDisponiblesPorTipo(String tipo, Date fechaComienzo, int cantidadDias) {
        return Arrays.stream(habitaciones)
                .filter(habitacion -> habitacion.getNombre().equals(tipo))
                .filter(habitacion -> esHabitacionDisponible(habitacion, fechaComienzo, cantidadDias))
                .collect(Collectors.toList());
    }

    public void verPrecioHabitacionesPorTipo() {
        List<Habitacion> habitaciones = new ArrayList<>();
        habitaciones.add(new Simple());
        habitaciones.add(new Doble());
        habitaciones.add(new Matrimonial());
        for (Habitacion habitacion : habitaciones) {
            System.out.println("Tipo: " + habitacion.getNombre() + ", precio: " + habitacion.getPrecio());
        }
    }
    public double consultarDescuentosGenerales(int cantidadDeDias) {
        if (cantidadDeDias <= 6 ){
            return 0.0;
        }
        else if (7 >= cantidadDeDias && cantidadDeDias <= 14){
            return Descuento.UnaSemana.ordinal();
        } else if (cantidadDeDias < 30) {
            return Descuento.QuinceDias.ordinal();
        }else {
            return Descuento.UnMes.ordinal();
        }
    }
    public double consultarImporteReserva(Reserva reserva) {
        return reserva.getHabitacion().getPrecio() * reserva.getCantidadDias();
    }
    public void cambiarEstadoReserva(Reserva reserva, EstadoReserva nuevoEstado) {
        reserva.setEstadoReserva(nuevoEstado);
    }
    public void agregarReserva(Cliente cliente, Habitacion habitacion, Date fechaComienzo, int cantidadDias, double importeTotal, double sena) {

        if (esHabitacionDisponible(habitacion, fechaComienzo, cantidadDias)) {
            Reserva nuevaReserva = crearReserva(cliente,habitacion,fechaComienzo,cantidadDias,importeTotal,sena);
            List<Reserva> reservaList = new ArrayList<>(List.of(reservas));
            reservaList.add(nuevaReserva);
            reservas = reservaList.toArray(new Reserva[0]);
            habitacion.setEstado(Estado.Reservada);
            System.out.println("Reserva agregada exitosamente.");

        } else {
            System.out.println("La habitación " + habitacion.getNumero()+ " no está disponible en las fechas especificadas.");
        }
    }
    public static double calcularImporteReserva(Habitacion habitacion, int cantidadDias) {
        return habitacion.getPrecio() * cantidadDias;
    }
    public boolean esHabitacionDisponible(Habitacion habitacion, Date fechaComienzo, int cantidadDias) {
        for (Reserva reserva : reservas) {
            if (reserva.getHabitacion().equals(habitacion)) {
                Date fechaFinReserva = new Date(reserva.getFechaComienzo().getTime() + (cantidadDias * 24 * 60 * 60 * 1000));
                if (fechaComienzo.before(fechaFinReserva) && fechaFinReserva.after(fechaComienzo)) {
                    return false;
                }
            }
        }
        return true;
    }



}
