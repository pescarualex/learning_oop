package org.example.ex1;

public class Circle extends Shape{
    private final double raza;

    public Circle(double raza){
        if(raza < 0){
            throw  new IllegalArgumentException("Raza can't be negative.");
        }
        this.raza = raza;
    }

    @Override
    double calculateAria(){
        double aria = 0;
        aria = Math.PI * Math.pow(raza,2);
        return aria;
    }

    @Override
    double calculatePerimeter(){
        double perimeter = 0;
        perimeter = 2 * Math.PI * raza;
        return perimeter;
    }

    @Override
    public String toString() {
        return super.toString() + "Circle{" +
                "raza=" + raza +
                '}';
    }
}
