package com.company;

public class Person {

    private String name;
    private String city;

    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String  greetings (){
       return String.format(name+ " comes from "+ city);

    }
}
