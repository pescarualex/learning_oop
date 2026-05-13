package org.example.ex4;

public class Dog extends Mammal implements Swim {

    public Dog(String name, double age, String furColor) {
        super(name, age, furColor);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
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
