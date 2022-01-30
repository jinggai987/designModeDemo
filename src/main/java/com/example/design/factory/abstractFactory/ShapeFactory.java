package com.example.design.factory.abstractFactory;

import com.example.design.factory.Circle;
import com.example.design.factory.Color;
import com.example.design.factory.Rectangle;
import com.example.design.factory.Shape;
import com.example.design.factory.abstractFactory.father.AbstractFactory;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }

}
