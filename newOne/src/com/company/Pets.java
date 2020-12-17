package com.company;

public class Pets {

    private String name;
    private String spice;


    public Pets(String name, String spice) {
        this.name = name;
        this.spice = spice;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "name='" + name + '\'' +
                ", spice='" + spice + '\'' +
                '}';
    }

    public String getSpice() {
        return spice;
    }
}
