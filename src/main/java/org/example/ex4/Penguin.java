package org.example.ex4;

public class Penguin extends Bird implements Swimmer {

    public Penguin(String name, int age, double wingsSpan) {
        super(name, age, wingsSpan);
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
