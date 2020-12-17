package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println("Do something");

        System.out.println("be brave ");


        Person p1= new Person("Sam","Chicago");
        Person p2 = new Person("Gwen", "London");

        String result = p1.greetings();
        String result2 = p2.greetings();


        System.out.println(result);
        System.out.println(result2);


        Car c1 = new Car("Honda", "Civic",2005);
        System.out.println(c1);


        Pets dog = new Pets( "Velka", "dog");
        System.out.println(dog);

        Pets cat = new Pets("Garfield","cat");
        System.out.println(cat);

        Potwory pot1 = new Potwory("Adaś", "Niebieski", 6);
        System.out.println(pot1.toString());

    }
}
