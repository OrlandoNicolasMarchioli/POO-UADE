package org.uade.ejercicio2;

import org.uade.Main;

public class Utilidades2b {
    private static final double PI = Math.PI;

    /**
     * Ejercicio 2b
     * Generá una clase Utilidades2b.java y en la misma:
     * 1. Escribí un método llamado area con un parámetro de tipo double llamado radio. El
     * método retornará un valor double que representará el área de un círculo. Si el radio del
     * parámetro es negativo, devuelve -1.0 para representar un valor no válido.
     */

    public static double area(double radio) {
        if (radio > 0) {
            return PI * (radio * radio);
        } else {
            return -1;
        }
    }

    /**
     * 2. Escribí otro método sobrecargado con 2 parámetros x e y (ambos double), donde x e y
     * representan los lados de un rectángulo. El método deberá retornar el área de un rectángulo.
     * Si uno o ambos parámetros son negativos, devuelve -1.0 para indicar un valor no válido.
     */

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        } else {
            return x * y;
        }
    }

    /**
     *  3. Creá todos los diagramas de clases y objetos utilizando PlantUML. Exportá el resultado en
     *  una imagen y agregalo a lo entregado con este ejercicio.
     */

    /**
     4. Incluí en el programa Main.java los siguientes ejemplos:
     a. Rectángulo de base = 3.4 y altura=2.2
     b. Círculo de radio 3.2
     c. Cuadrado de 2,5 de lado
     d. Círculos y rectángulos inválidos
     */
}
