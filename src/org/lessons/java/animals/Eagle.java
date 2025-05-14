package org.lessons.java.animals;

public class Eagle extends AmbstactAnimal implements IFlyer {
    @Override
    public void makeSound() {
        System.out.println("Cow Cow!");
    }

    @Override
    public void eat() {
        System.out.println("the eagle is eating insects");
    }

    @Override
    public void fly() {
        System.out.println("I'm flyng in the sky");
    }
}
