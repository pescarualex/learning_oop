package org.example;

import org.example.ex2.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
//        ex1
//        Shape circle = new Circle(8);
//
//        Shape triangle = new Triangle(3, 4, 5);
//
//        Shape square = new Square(15);
//
//        List<Shape> shapes = new ArrayList<>();
//        shapes.add(circle);
//        shapes.add(triangle);
//        shapes.add(square);
//
//        double totalArea = 0;
//
//        for (Shape shape : shapes) {
//            shape.describe();
//            totalArea += shape.calculateArea();
//        }
//
//        System.out.println("Total area: " + totalArea);


//
//        ex2
        Notification email = new Email("alexflopesca@gmail.com", "Test Email", "This email is a test");
        Notification sms = new SMS("+403728273543", "Will drink today a coffee?");
        Notification push = new Push("ABC123-RO", "Need approval on task nr. 34");

        Notification email2 = new Email("alex_florin@gmail.com", "Test Email", "This email is a test");
        Notification sms2 = new SMS("+2324324324324", "Will drink today a coffee?");
        Notification push2 = new Push("zzz32-RO", "Need approval on task nr. 38");

        List<Notification> notifications = new ArrayList<>();
        notifications.add(email);
        notifications.add(sms);
        notifications.add(push);
        notifications.add(email2);
        notifications.add(sms2);
        notifications.add(push2);

        for (Notification notification : notifications) {
            notification.send();
        }

        for (Notification notification : notifications) {
            if (notification instanceof Loggable loggable) {
                loggable.logToConsole();
            }
        }
    }
}
