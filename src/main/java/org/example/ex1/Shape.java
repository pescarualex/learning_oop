package org.example.ex1;

public abstract class Shape {

    private final String name;
    private final String color;

    public Shape(String name, String color){
        this.name = name;
        this.color = color;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

    public void describe(){
        System.out.println(name + " " + color + " and have the aria: " + calculateArea() +
                ", and the perimeter: " + calculatePerimeter());
    }

    public double getArea(){
        return calculateArea();
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
