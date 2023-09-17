package org.uade.ejercicioHotel.habitaciones;
import org.uade.ejercicioHotel.enums.Estado;

public class Simple extends Habitacion{

    private final double PRECIO_SIMPLE = 500;
    private String nombre;

    private double precio;

    public Simple() {
        super(500,"Habitacion simple");
        this.precio = PRECIO_SIMPLE;
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
