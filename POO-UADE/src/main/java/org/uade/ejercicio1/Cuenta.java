package org.uade.ejercicio1;

import org.uade.ejercicio1.Persona;

import java.util.Scanner;

public class Cuenta {
    private final Persona titular;
    
    private double saldo;
    
    private boolean activa;

    public Cuenta(Persona titular) {
        this.titular = titular;
    }

    public Cuenta(Persona titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public static void ingresar(Cuenta cuenta, double importe){
        if(importe > 0){
            cuenta.setSaldo(cuenta.getSaldo() + importe);
        }
    }

    /**
     * 3.2.retirar(double importe): se retira una cantidad de la cuenta, si el resultado del retiro es
     * negativo, se dará opción a retirar el saldo existente o cancelar el retiro. En caso de cancelar,
     * se retornará cero.
     */
    public static void retirar(Cuenta cuenta, double importe){
        if(cuenta.getSaldo() < importe) {
            System.out.println("El importe a retirar es mayor al saldo " + cuenta.getSaldo());
            System.out.println("Desea retirar la diferencia? SI/NO");
            Scanner saldoMenor = new Scanner(System.in);
            String afirmacion = saldoMenor.nextLine();

            if (afirmacion.equals("SI")) {
                System.out.println("El dinero retirado es: " + String.valueOf(cuenta.getSaldo()));
                cuenta.setSaldo(0);
                System.out.println("Su saldo es: " + String.valueOf(cuenta.getSaldo()));
            } else {
                System.out.println("Su saldo actual es: " + String.valueOf(cuenta.getSaldo()));
            }
            saldoMenor.close();
        }
        else{
            cuenta.setSaldo(cuenta.getSaldo() - importe);
            System.out.println("Su saldo actual es: " + String.valueOf(cuenta.getSaldo()));
        }
    }

    /**
     * transferir(Cuenta cuenta, double importe): se utilizará para transferir fondos de una cuenta
     * a la otra. No se permitirá transferir más saldo del existente. Si la transferencia supera los
     * fondos disponibles se deberá dar opción a transferir el saldo existente o cancelar la
     * operación.
     */
    public static void transferir(Cuenta cuenta,double importe){

        if(importe > cuenta.getSaldo()) {
            System.out.println("El importe a transferir es mayor al saldo de la cuenta");
            System.out.println("Desea transferir el saldo restante: SI/NO " + cuenta.getSaldo());
            Scanner saldoMenor = new Scanner(System.in);
            String afirmacion = saldoMenor.nextLine();

            if (afirmacion.equals("SI")) {
                System.out.println("El dinero transferido es: " + String.valueOf(cuenta.getSaldo()));
                cuenta.setSaldo(0);
                System.out.println("Su saldo es: " + String.valueOf(cuenta.getSaldo()));
            } else {
                System.out.println("La operacion ha sido cancelada");
            }
            saldoMenor.close();
        }
        else{
            System.out.println("Transferencia exitosa");
            cuenta.setSaldo(cuenta.getSaldo() - importe);
            System.out.println("Saldo restante: " + cuenta.getSaldo());
        }
    }

    public static boolean mismoSaldo(Cuenta cuenta1, Cuenta cuenta2){
        if (cuenta1.getSaldo() == cuenta2.getSaldo()){
            return true;
        }else{
            return false;
        }
    }

}
