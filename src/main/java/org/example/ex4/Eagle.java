package org.example.ex4;

public class Eagle extends Birds implements Fly {

    public Eagle(String name, double age, double wingsSpan) {
        super(name, age, wingsSpan);
    }

    @Override
    public void makeSound() {
        System.out.println("Screech");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping.");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying.");
    }
}
