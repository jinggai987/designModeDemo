package com.example.design.factory.factory;

import com.example.design.factory.Circle;
import com.example.design.factory.Rectangle;
import com.example.design.factory.Shape;

public class ShapeFactory {

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
