package org.lessons.java.animals;

public class Dog extends AmbstactAnimal {

    @Override
    public void makeSound() {
        System.out.println("Woof Woof! ");
    }

    @Override
    public void eat() {
        System.out.println("The dog is now eating from is dog bowl");
    }

}
