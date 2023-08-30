package org.uade.clase1.models;

public class Dog extends Animal{
    public Dog(String colour) {
        super(colour);
    }

    public void manipulateColour(){
        this.setColour("red");
    }
}
