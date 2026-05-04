package org.example.ex1;

public class Circle extends Shape{
    private final double radius;

    public Circle(double raza){
        super("Circle", "Red");
        if(raza <= 0){
            throw  new IllegalArgumentException("Raza can't be negative.");
        }
        this.radius = raza;
    }

    @Override
    double calculateArea(){
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + "Circle{" +
                "raza=" + radius +
                '}';
    }
}
