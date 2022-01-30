package com.example.design.factory.abstractFactory;

import com.example.design.factory.Color;
import com.example.design.factory.Green;
import com.example.design.factory.Red;
import com.example.design.factory.Shape;
import com.example.design.factory.abstractFactory.father.AbstractFactory;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
