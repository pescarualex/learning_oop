package org.example.ex1;

public class Square extends Shape {
    private final double length;

    public Square(double length) {
        super("Square", "Yellow");
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be grater than zero");
        }
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return Math.pow(length, 2);
    }

    @Override
    double calculatePerimeter() {
        return 4 * length;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + "Square{" +
                "length=" + length +
                '}';
    }
}
