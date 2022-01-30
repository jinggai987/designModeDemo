package com.example.design.factory.abstractFactory.father;

import com.example.design.factory.Color;
import com.example.design.factory.Shape;

public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);

}
