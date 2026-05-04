package org.example;

import org.example.ex1.Circle;
import org.example.ex1.Shape;
import org.example.ex1.Square;
import org.example.ex1.Triangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        Shape circle = new Circle(8);
        circle.setName("Circle");
        circle.setColor("Red");

        double[] sides = {10,6,7};
        Shape triangle = new Triangle(10, 8, sides);
        triangle.setName("Triangle");
        triangle.setColor("Blue");

        Shape square = new Square(15);
        square.setName("Square");
        square.setColor("Yellow");

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(triangle);
        shapes.add(square);

        for(Shape shape : shapes){
            shape.describe();
        }
    }
}
