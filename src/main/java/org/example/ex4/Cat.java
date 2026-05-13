package org.example.ex4;

public class Cat extends Mammal {

    public Cat(String name, int age, String furColor) {
        super(name, age, furColor);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow.");
    }
}
