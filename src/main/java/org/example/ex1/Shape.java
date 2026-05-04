package org.example.ex1;

public abstract class Shape {

    private String name;
    private String color;

    abstract double calculateAria();
    abstract double calculatePerimeter();

    public void describe(){
        System.out.println(name + " " + color + " and have the aria: " + calculateAria() +
                ", and the perimeter: " + calculatePerimeter());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
