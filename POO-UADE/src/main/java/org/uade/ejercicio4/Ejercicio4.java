package org.uade.ejercicio4;

import org.uade.ejercicio4.clientes.Cliente;
import org.uade.ejercicio4.enums.Estado;
import org.uade.ejercicio4.enums.EstadoReserva;
import org.uade.ejercicio4.habitaciones.Habitacion;
import org.uade.ejercicio4.Reservas.Reserva;
import org.uade.ejercicio4.enums.TipoCliente;
import org.uade.ejercicio4.habitaciones.Doble;
import org.uade.ejercicio4.habitaciones.Matrimonial;
import org.uade.ejercicio4.habitaciones.Simple;
import org.uade.ejercicio4.hotel.Hotel;

import java.util.Date;
import java.util.Random;

import static org.uade.ejercicio4.Reservas.Reserva.generarReserva;
import static org.uade.ejercicio4.hotel.Hotel.calcularImporteReserva;

public class Ejercicio4 {

    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[10];

        for (int i = 0; i < 10; i++) {
            Cliente cliente = new Cliente(i + 1, "Cliente" + (i + 1), "Apellido" + (i + 1), TipoCliente.Habitual);
            if(i % 2 == 0){
                cliente.setTipo(TipoCliente.Esporadico);
            }
            clientes[i] = cliente;
        }

        Habitacion[] habitaciones = new Habitacion[10];

        for (int i = 0; i < 10; i++) {
            Habitacion habitacion;
            if (i % 3 == 0) {
                habitacion = new Simple();
            } else if (i % 3 == 1) {
                habitacion = new Doble();
            } else {
                habitacion = new Matrimonial();
            }
            habitacion.setNumero(i + 1);
            habitacion.setPiso(1);
            habitacion.setEstado(Estado.Disponible);
            habitaciones[i] = habitacion;
        }

        Reserva[] reservas = new Reserva[10];

        for (int i = 0; i < 10; i++) {
            Cliente cliente = clientes[i];
            Habitacion habitacion = habitaciones[i];
            Date fechaComienzo = new Date();
            int cantidadDias = new Random().nextInt(1,40);
            double importeTotal = calcularImporteReserva(habitacion,cantidadDias);// Importe total ficticio
            if(cliente.getTipo() == TipoCliente.Habitual){
                Reserva reserva = new Reserva(cliente, habitacion, fechaComienzo, cantidadDias, importeTotal);
                reservas[i] = reserva;
            }else{
                double sena = 100.0;
                Reserva reserva = generarReserva(cliente, habitacion, fechaComienzo, cantidadDias, importeTotal, sena);
                reservas[i] = reserva;
            }
        }

        Hotel hotel = new Hotel(reservas, habitaciones, clientes);

        /**
         * Ingreso de valores
         */

        hotel.verPrecioHabitacionesPorTipo();

        // Consultar el importe a pagar de una reserva específica
        Reserva reservaEjemplo = reservas[0];
        double importeAPagar = hotel.consultarImporteReserva(reservaEjemplo);
        System.out.println("Importe a pagar de la reserva 0: $" + importeAPagar);

        // Verificar si una habitación específica está disponible para ciertas fechas (por ejemplo, la habitación 5)
        Habitacion habitacionEjemplo = habitaciones[5];
        Date fechaInicio = new Date(); // Fecha de inicio ficticia
        int diasReserva = 3; // Duración ficticia de la reserva
        boolean habitacionDisponible = hotel.esHabitacionDisponible(habitacionEjemplo, fechaInicio, diasReserva);
        if (habitacionDisponible) {
            System.out.println("La habitación " + habitacionEjemplo.getNumero() + " está disponible para las fechas seleccionadas.");
        } else {
            System.out.println("La habitación " + habitacionEjemplo.getNumero() + " no está disponible para las fechas seleccionadas.");
        }

        // Cambiar el estado de una reserva específica (por ejemplo, la reserva 1)
        Reserva reservaCambiarEstado = reservas[1];
        Reserva.cambiarEstadoDeReserva(reservaCambiarEstado, EstadoReserva.Activa); // Cambiar a estado de activa

        // Agregar una nueva reserva ficticia (requiere verificar disponibilidad y ajustar los valores según tus necesidades)
        Cliente nuevoCliente = new Cliente(11, "Pedro", "Gonzalez", TipoCliente.Esporadico);
        Habitacion nuevaHabitacion = habitaciones[9];
        Date nuevaFechaInicio = new Date(); // Fecha de inicio ficticia
        int nuevaDuracion = 4; // Duración ficticia de la reserva
        double nuevoImporteTotal = 400.0; // Importe total ficticio
        double nuevaSena = 150.0; // Sena ficticia
        hotel.agregarReserva(nuevoCliente, nuevaHabitacion, nuevaFechaInicio, nuevaDuracion, nuevoImporteTotal, nuevaSena);

        // Calcular el importe de una reserva específica (por ejemplo, la reserva 2)
        Reserva reservaCalcularImporte = reservas[2];
        double importeReserva = hotel.consultarImporteReserva(reservaCalcularImporte);
        System.out.println("Importe a pagar de la reserva 2: $" + importeReserva);

    }
}
