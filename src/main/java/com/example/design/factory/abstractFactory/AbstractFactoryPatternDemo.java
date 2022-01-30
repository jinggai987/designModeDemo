package com.example.design.factory.abstractFactory;

import com.example.design.factory.Color;
import com.example.design.factory.Shape;
import com.example.design.factory.abstractFactory.father.AbstractFactory;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        //获取形状工厂
        AbstractFactory factory = FactoryProducer.getFactory("COLOR");
        Color color = factory.getColor("RED");
        color.fill();

        AbstractFactory factory2 = FactoryProducer.getFactory("SHAPE");
        Shape shape = factory2.getShape("CIRCLE");
        shape.draw();
    }
}
