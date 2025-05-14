package org.lessons.java.animals;

public class Dolphin extends Animal implements ISwimmer {
    @Override
    public void makeSound() {
        System.out.println("Click click! ");
    }

    @Override
    public void eat() {
        System.out.println("the Dolphin is eathig fish");
    }

    @Override
    public void swim() {
        System.out.println("I'm Swimming!!");
    }

}
