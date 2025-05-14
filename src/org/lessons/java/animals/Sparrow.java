package org.lessons.java.animals;

public class Sparrow extends AmbstactAnimal implements IFlyer {
    @Override
    public void makeSound() {
        System.out.println("Tweet tweet!");
    }

    @Override
    public void eat() {
        System.out.println("The sarrow is eating small worms");
    }

    @Override
    public void fly() {
        System.out.println("I'm flyng in the forest");
    }
}
