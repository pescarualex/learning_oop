package org.example.ex1;


public class Triangle extends  Shape{
    private final double base;
    private final double height;
    private final double hypotenuse;

    public Triangle(double base, double height, double hypotenuse){
        super("Triangle", "Blue");
        if(base <= 0 || height <= 0 || hypotenuse <= 0){
            throw new IllegalArgumentException("Base and Height can't be negative.");
        }

        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    @Override
    protected double calculateArea(){
        return (base + height + hypotenuse) / 2;
    }

    @Override
    double calculatePerimeter(){
        return base + height + hypotenuse;
    }

    @Override
    public String toString() {
        return super.toString() + "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", hypotenuse=" + hypotenuse +
                '}';
    }
}
