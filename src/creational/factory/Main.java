package creational.factory;

import creational.factory.shapeTypes.Shape;
import creational.factory.shapeTypes.ShapeFactory;

public class Main {

    /*
            The Factory pattern is a creational design pattern
            that provides an interface for creating objects
            in a superclass, but allows subclasses to alter the type of objects that will be created.
             The Factory pattern is used when you need to create objects based on specific conditions or inputs but want to avoid direct instantiation of objects using the new keyword.
     */
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get an object of Circle and call its draw method
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Get an object of Rectangle and call its draw method
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        // Get an object of Square and call its draw method
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

    }



}