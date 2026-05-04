package org.example.ex1;

public abstract class Shape {

    private final String name;
    private final String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public void describe() {
        System.out.println(name + " " + color + " and have the area: " + calculateArea() +
                ", and the perimeter: " + calculatePerimeter());
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
