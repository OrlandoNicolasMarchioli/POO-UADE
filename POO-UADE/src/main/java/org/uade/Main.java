package org.uade;

import org.uade.ejercicio1.Cuenta;
import org.uade.ejercicio1.Persona;

import java.util.Scanner;

import static org.uade.ejercicio1.Cuenta.*;

public class Main {
    public static void main(String[] args) {
//        Animal fido = new Animal("green");
//        fido.setColour("yellow");
//
//        Dog firulais = new Dog("red");
//
//        Student student1 = new Student();
//        Student.setUniversity("UADE");
//        student1.setName("Pedro");
//
//        Student student2 = new Student();
//        Student.setUniversity("Other University");
//        student2.setName("Juan");
//
//        System.out.println(student1.getName() + " " + student1.getUniversity());
        Persona titular1 = new Persona("Garcia","Pedro",23445621);
        Persona titular2 = new Persona("Perez","Martina",23477721);

        Cuenta cuenta1 = new Cuenta(titular1);
        Cuenta cuenta2 = new Cuenta(titular2,1600);

        Scanner scanner = new Scanner(System.in);

        /**
             Retire Dinero en la primera cuenta. Muestre el resultado por pantalla
         */
        System.out.println("Ingrese importe a retirar:");
        double importe = scanner.nextDouble();
        scanner.nextLine();

        retirar(cuenta1, importe);

        /**
         *  Ingrese Dinero de la segunda cuenta. Muestre el saldo existente por pantalla
         */

        System.out.println("Ingrese importe a ingresar:");
        double importe2 = scanner.nextDouble();
        scanner.nextLine();

        ingresar(cuenta2,importe2);
        System.out.println("Saldo existente cuenta 2: " + cuenta2.getSaldo());

        /**
            Verifique si ambas cuentas tienen el mismo saldo y muéstrelo por pantalla
         */
        boolean mismoSaldo = mismoSaldo(cuenta1,cuenta2);
        System.out.println("Las cuentas tienen el mismo saldo?: " + mismoSaldo);

        scanner.close();
    }


}