package org.example.ex4;

public class Penguin extends Birds implements Swim {

    public Penguin(String name, double age, double wingsSpan) {
        super(name, age, wingsSpan);
    }

    @Override
    public void makeSound() {
        System.out.println("Honk");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming.");
    }
}
