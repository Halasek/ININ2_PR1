package com.company;


public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("canis");
        Animal cat = new Animal("felis");

        dog.name = "Szarik";
        dog.species = "canis";
        dog.weight = 21.3;
        dog.age = 5;
        dog.alive = true;
        System.out.println(dog.name);

        cat.name = "Sierśiuch";
        System.out.println("a kot żyje?" + cat.alive);
        System.out.println("waga kota: " + cat.weight);
        cat.introduceYourself();
        dog.introduceYourself();

        cat.doYouLike("mouse");
        dog.doYouLike("mouse");

        Integer humanAge = dog.getHumanAge();
        System.out.println("If I'll be human I'll be " + humanAge + " years old");

        Human me = new Human();
        me.firstName = "Jakub";
        me.lastName = "Hałas";

        me.pet = dog;
        System.out.println("I have a " + me.pet.species);
        System.out.println("I call it " + me.pet.name);


        Car ford = new Car();
        ford.producer = "ford";
        ford.model = "mondeo";
        ford.millage = 256900.0;
        ford.engineSize = 1.4;
        ford.value = 25999.9;

        me.setSalary(2000.0);
        me.setCar(ford);
        System.out.println(me.getCar().model);

    }
}
