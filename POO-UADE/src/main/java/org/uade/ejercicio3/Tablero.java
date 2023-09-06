package org.uade.ejercicio3;

public class Tablero {

    private Ejercito ejercito1;

    private Ejercito ejercito2;

    public Tablero(Ejercito ejercito1, Ejercito ejercito2){
        this.ejercito1 = ejercito1;
        this.ejercito2 = ejercito2;
    }

    public static void enfrentar (Ejercito ejercito1, Ejercito ejercito2){
        if(ejercito1.getPoderTotal() > ejercito2.getPoderTotal()){
            System.out.println("Gano el " + ejercito1.getColor());
        } else if (ejercito2.getPoderTotal() > ejercito1.getPoderTotal()) {
            System.out.println("Gano el " + ejercito2.getColor());
        }else {
            System.out.println("No gano ninguno");
        }
    }
}
