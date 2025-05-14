import org.lessons.java.animals.Dog;
import org.lessons.java.animals.Dolphin;
import org.lessons.java.animals.Eagle;
import org.lessons.java.animals.Sparrow;

public class App {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog();
        dog.eat();
        dog.makeSound();
        dog.sleep();

        System.out.println("-----------------------------------");

        Dolphin dolphin = new Dolphin();
        dolphin.eat();
        dolphin.makeSound();
        dolphin.swim();
        dolphin.sleep();

        System.out.println("----------------------------------");

        Sparrow sparrow = new Sparrow();
        sparrow.eat();
        sparrow.makeSound();
        sparrow.fly();
        sparrow.sleep();

        System.out.println("----------------------------------");

        Eagle eagle = new Eagle();
        eagle.eat();
        eagle.makeSound();
        eagle.fly();
        eagle.sleep();

    }
}
