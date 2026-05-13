package org.example;

import org.example.ex4.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        //ex4
        Animal dog = new Dog("Linda", 11, "black");
        Animal cat = new Cat("Kiki", 3, "orange");
        Animal eagle = new Eagle("Jack", 2, 0.5);
        Animal penguin = new Penguin("Yoyo", 1.5, 0.3);

        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(eagle);
        animals.add(penguin);

        for (Animal animal : animals) {
            animal.sleep();
            animal.makeSound();

            if (animal instanceof Swim swimmers) {
                swimmers.swim();
            }

            if (animal instanceof Fly fliers) {
                fliers.fly();
            }
        }


    }


}
