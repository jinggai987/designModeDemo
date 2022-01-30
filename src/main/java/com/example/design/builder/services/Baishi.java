package com.example.design.builder.services;

import com.example.design.builder.services.father.ColdDrink;

public class Baishi extends ColdDrink {
    @Override
    public float price() {
        return 4f;
    }

    @Override
    public String name() {
        return "百事可乐";
    }
}
