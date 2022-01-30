package com.example.design.builder.services;

import com.example.design.builder.services.father.Burger;

public class VegBurger extends Burger {
    @Override
    public float price() {
        return 18f;
    }

    @Override
    public String name() {
        return "菜堡";
    }
}
