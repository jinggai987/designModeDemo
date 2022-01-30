package com.example.design.factory.factory;

import com.example.design.factory.Shape;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Circle 对象
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();

        // Rectangle 对象
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
    }

}
