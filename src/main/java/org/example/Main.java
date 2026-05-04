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

        Shape triangle = new Triangle(10, 8, 6);

        Shape square = new Square(15);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(triangle);
        shapes.add(square);

        double totalAria = 0;

        for(Shape shape : shapes){
            shape.describe();
            totalAria += shape.getArea();
        }

        System.out.println("Total aria: " + totalAria);
    }
}
