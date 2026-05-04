package org.example.ex1;

public class Square extends Shape{
    private final double length;

    public Square(double length){
        if(length < 0){
            throw  new IllegalArgumentException("Length can't be negative.");
        }
        this.length = length;
    }

    @Override
    double calculateAria(){
        double aria = 0;
        aria = Math.pow(length, 2);
        return aria;
    }

    @Override
    double calculatePerimeter(){
        double perimeter = 0;
        perimeter = 4 * length;
        return perimeter;
    }

    @Override
    public String toString() {
        return super.toString() + "Square{" +
                "length=" + length +
                '}';
    }
}
