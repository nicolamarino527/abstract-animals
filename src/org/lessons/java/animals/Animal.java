package org.lessons.java.animals;

abstract class Animal {
    // metodi comuni a tutte le classi
    public void sleep() {
        System.out.println("ZZzz... the animal is sleeping...");
    }

    // metodi astratti
    public abstract void makeSound();

    public abstract void eat();

}
