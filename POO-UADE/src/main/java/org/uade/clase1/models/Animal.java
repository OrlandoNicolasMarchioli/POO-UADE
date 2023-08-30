package org.uade.clase1.models;

public class Animal {

    public String colour;
    private String name;

    public Animal(String colour) {
        this.colour = colour;
    }

    public void bite(){
        String bite = "hard";
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
