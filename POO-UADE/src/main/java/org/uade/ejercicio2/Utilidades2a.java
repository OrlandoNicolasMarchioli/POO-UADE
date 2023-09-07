package org.uade.ejercicio2;

public class Utilidades2a {

    private static final double KILOMETROS_POR_MILLA = 1.609;

    /**
     * 1. aMillasPorHora
     * Escribí un método llamado aMillasPorHora que servirá para convertir un valor dado en
     * KM/h a Mi/h. El método tendrá 1 parámetro de tipo double con el nombre
     * kilometrosPorHora. Este método retornará el valor redondeado del cálculo en un tipo long.
     * Si el argumento kilometrosPorHora es inferior a 0, el método aMillasPorHora, retornar
     * -1 para indicar un valor no válido. De lo contrario, si es positivo, calcular y devolver el valor de
     * millas por hora. Para conversión y redondeo, verificá las notas en el punto 3 al final del
     * enunciado.
     * NOTA: 1 milla por hora son 1,609 kilómetros por hora.
     */

    public static long aMillasPorHora(double kilometrosPorHora) {
        if (kilometrosPorHora < 0) {
            return -1;
        }
        double aMillas = kilometrosPorHora / KILOMETROS_POR_MILLA;
        return Math.round(aMillas);
    }

    /**
     * 2. imprimirConversion
     * Escribí otro método llamado imprimirConversion con 1 parámetro de tipo doble con el
     * nombre kilometrosPorHora. Este método no retornará valores (vacío) y necesita calcular
     * millas por hora, a partir del parámetro kilometrosPorHora.
     * Imprimir el mensaje en el siguiente formato: "XX km/h = YY mi/h".
     * - XX representa el valor original kilómetros por hora.
     * - YY representa las millas por hora redondeadas del parámetro de kilómetros por hora.
     * Si el parámetro kilometrosPorHora es < 0, imprima el texto "Valor no válido".
     * Ejemplos de entrada/salida:
     * imprimirConversion(1.5); // debe imprimir: 1,5 km/h = 1 mi/h
     * imprimirConversion(10.25); // debe imprimir: 10,25 km/h = 6 mi/h
     * imprimirConversion(-5.6); // debe imprimir: Valor no válido
     */

    public static void imprimirConversion(double kilometrosPorAhora) {
        if (aMillasPorHora(kilometrosPorAhora) < 0) {
            System.out.println("Valor no válido");
        } else {
            long millasPorHora = aMillasPorHora(kilometrosPorAhora);
            System.out.println(String.valueOf(kilometrosPorAhora) + " km/h = " + String.valueOf(millasPorHora) + " mi/h");
        }
    }
}
