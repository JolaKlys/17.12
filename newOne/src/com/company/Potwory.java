package com.company;

public class Potwory {
    private String name;
    private String colour;
    private int numberOfEyes;

    public Potwory(String name, String colour, int numberOfEyes) {
        this.name = name;
        this.colour = colour;
        this.numberOfEyes = numberOfEyes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    @Override
    public String toString() {
        return "Potwory{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", numberOfEyes=" + numberOfEyes +
                '}';
    }
}
