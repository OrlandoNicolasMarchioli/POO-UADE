package org.uade.ejercicio2;

public class Utilidades2c {


    /**
     * 1. Escribí un método llamado saberCuantasLatas con 4 parámetros.
     *  El primer parámetro debe llamarse ancho de tipo double. Este parámetro representa
     * el ancho de la pared a pintar.
     *  El segundo parámetro debe llamarse altura de tipo double. Este parámetro
     * representa la altura de la pared.
     *  El tercer parámetro debe llamarse areaPorLata y representa el área que se puede
     * cubrir con una lata de pintura.
     *  El cuarto parámetro debe llamarse latasExtra. Este parámetro representa el conteo
     * de latas que Bob tiene en casa. Este método deberá retornar un valor de tipo int que
     * represente la cantidad de latas que Bob necesita comprar antes de ir a trabajar. Para
     * calcular el número de latas, consultá las notas a continuación:
     * o Si uno de los parámetros ancho, altura o areaPorLata es menor o igual a 0
     * o si latasExtra es menor que 0, el método debe devolver -1 para indicar un
     * valor no válido.
     * o Si todos los parámetros son válidos, el método deberá calcular el número de
     * latas y devolverlo.
     */
    public static int saberCuantasLatas(double ancho, double altura, double areaPorLata, double latasExtra) {
        if (ancho < 0 || altura < 0 || areaPorLata < 0 || latasExtra < 0) {
            return -1;
        } else {
            return (int) (Math.round((ancho * altura)/areaPorLata) + latasExtra);
        }
    }

    public static int saberCuantasLatas(double ancho, double altura, double areaPorLata) {
        return saberCuantasLatas(ancho, altura, areaPorLata, 0);
    }

    public static int saberCuantasLatas(double area, double areaPorLata) {
        return saberCuantasLatas(1,area,areaPorLata,0);
    }

}
