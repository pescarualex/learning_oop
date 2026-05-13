package org.example.ex4;

public abstract class Animal {
    private final String name;
    private final double age;

    public Animal(String name, double age) {
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

    abstract public void sleep();

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
