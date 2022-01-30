package com.example.design.builder.services;

import com.example.design.builder.services.father.Burger;

public class ChikenBurger extends Burger {
    @Override
    public float price() {
        return 20f;
    }

    @Override
    public String name() {
        return "鸡堡";
    }

}
