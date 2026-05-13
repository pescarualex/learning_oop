package org.example.ex4;

public class Cat extends Mammal {

    public Cat(String name, double age, String furColor) {
        super(name, age, furColor);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow.");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping.");
    }
}
