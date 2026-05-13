package org.example.ex4;

public abstract class Animal {
    private final String name;
    private final int age;

    public Animal(String name, int age) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be less than 0");
        }

        this.name = name;
        this.age = age;
    }

    abstract public void makeSound();

    public void sleep() {
        System.out.println(getName() + " is sleeping.");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
