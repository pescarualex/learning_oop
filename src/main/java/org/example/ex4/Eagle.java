package org.example.ex4;

public class Eagle extends Bird implements Flyer {

    public Eagle(String name, int age, double wingsSpan) {
        super(name, age, wingsSpan);
    }

    @Override
    public void makeSound() {
        System.out.println("Screech");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying.");
    }
}
