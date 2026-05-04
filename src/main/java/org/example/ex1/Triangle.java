package org.example.ex1;

import java.util.Arrays;

public class Triangle extends  Shape{
    private final double base;
    private final double height;
    private final double[] sides;

    public Triangle(double base, double heigth, double[] sides){
        if(base < 0 || heigth < 0){
            throw new IllegalArgumentException("Base and Height can't be negative.");
        }

        for(int i = 0; i < sides.length; i++){
            if (sides[i] < 0){
                throw new IllegalArgumentException("Sides can't be negative.");
            }
        }

        this.base = base;
        this.height = heigth;
        this.sides = sides;
    }

    @Override
    double calculateAria(){
        double aria = 0;
        aria = (base * height) / 2;
        return aria;
    }

    @Override
    double calculatePerimeter(){
        double perimeter = 0;
        for(int i = 0; i < sides.length; i++){
            perimeter += sides[i];
        }
        return perimeter;
    }

    @Override
    public String toString() {
        return super.toString() + "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", sides=" + Arrays.toString(sides) +
                '}';
    }
}
