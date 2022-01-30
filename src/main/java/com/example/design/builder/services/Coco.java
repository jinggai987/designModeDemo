package com.example.design.builder.services;

import com.example.design.builder.services.father.ColdDrink;

public class Coco extends ColdDrink {
    @Override
    public float price() {
        return 3.5f;
    }

    @Override
    public String name() {
        return "可口可乐";
    }
}
