package org.uade;

import org.uade.ejercicio1.Cuenta;
import org.uade.ejercicio1.Persona;

import java.util.Scanner;

import static org.uade.ejercicio1.Cuenta.*;
import static org.uade.ejercicio2.Utilidades2a.aMillasPorHora;
import static org.uade.ejercicio2.Utilidades2a.imprimirConversion;
import static org.uade.ejercicio2.Utilidades2b.area;
import static org.uade.ejercicio2.Utilidades2c.saberCuantasLatas;

public class Main {
    public static void main(String[] args) {


//          EJERCICIO1
//        Persona titular1 = new Persona("Garcia","Pedro",23445621);
//        Persona titular2 = new Persona("Perez","Martina",23477721);
//
//        Cuenta cuenta1 = new Cuenta(titular1);
//        Cuenta cuenta2 = new Cuenta(titular2,1600);
//
//        Scanner scanner = new Scanner(System.in);
//
//        /**
//             Retire Dinero en la primera cuenta. Muestre el resultado por pantalla
//         */
//        System.out.println("Ingrese importe a retirar:");
//        double importe = scanner.nextDouble();
//        scanner.nextLine();
//
//        retirar(cuenta1, importe);
//
//        /**
//         *  Ingrese Dinero de la segunda cuenta. Muestre el saldo existente por pantalla
//         */
//
//        System.out.println("Ingrese importe a ingresar:");
//        double importe2 = scanner.nextDouble();
//        scanner.nextLine();
//
//        ingresar(cuenta2,importe2);
//        System.out.println("Saldo existente cuenta 2: " + cuenta2.getSaldo());
//
//        /**
//            Verifique si ambas cuentas tienen el mismo saldo y muéstrelo por pantalla
//         */
//        boolean mismoSaldo = mismoSaldo(cuenta1,cuenta2);
//        System.out.println("Las cuentas tienen el mismo saldo?: " + mismoSaldo);
//
//        scanner.close();

        System.out.println("EJERCICIO2 A");

        imprimirConversion(-1);
        imprimirConversion(25.42);
        imprimirConversion(120);

        System.out.println("EJERCICIO2 B");

        System.out.println(area(3.4, 2.2));
        System.out.println(area(3.2));
        System.out.println(area(2.5, 2.5));
        System.out.println(area(-1, 2));
        System.out.println(area(-25));

        System.out.println("EJERCICIO2 C");

        System.out.println(saberCuantasLatas(-3.4, 2.1, 1.5, 2));
        System.out.println(saberCuantasLatas(3.4, 2.1, 1.5, 2));
        System.out.println(saberCuantasLatas(2.75, 3.25, 2.5, 1));
        System.out.println(saberCuantasLatas(1, 2.1, 1.5, 2));

        System.out.println(saberCuantasLatas(3.4, 1.5));
        System.out.println(saberCuantasLatas(6.26, 2.2));
        System.out.println(saberCuantasLatas(3.26, 0.75));
    }


}