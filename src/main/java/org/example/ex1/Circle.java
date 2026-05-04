package org.example.ex1;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        super("Circle", "Red");
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than zero");
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + "Circle{" +
                "radius=" + radius +
                '}';
    }
}
