package org.example.ex4;

public class Dog extends Mammal implements Swimmer {

    public Dog(String name, int age, String furColor) {
        super(name, age, furColor);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming.");
    }
}
