package org.example.ex1;

public class Triangle extends Shape {
    private final double base;
    private final double height;
    private final double hypotenuse;

    public Triangle(double base, double height, double hypotenuse) {
        super("Triangle", "Blue");
        if (base <= 0 || height <= 0 || hypotenuse <= 0) {
            throw new IllegalArgumentException("Base, Height and Hypotenuse must be greater than zero");
        }

        double sumOfLegsSquared = Math.pow(base, 2) + Math.pow(height, 2);
        double hypotenuseSquared = Math.pow(hypotenuse, 2);
        boolean isValidRightTriangle = Math.abs(sumOfLegsSquared - hypotenuseSquared) < 1e-9;

        if (isValidRightTriangle) {
            this.base = base;
            this.height = height;
            this.hypotenuse = hypotenuse;
        } else {
            throw new IllegalArgumentException("Not right-angled triangle.");
        }
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return base + height + hypotenuse;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", hypotenuse=" + hypotenuse +
                '}';
    }
}
