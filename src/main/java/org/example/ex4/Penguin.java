package org.example.ex4;

public class Penguin extends Bird implements Swimmer {

    public Penguin(String name, int age, double wingSpan) {
        super(name, age, wingSpan);
    }

    @Override
    public void makeSound() {
        System.out.println("Honk");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming.");
    }
}
