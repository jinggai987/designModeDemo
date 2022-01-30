package com.example.design.builder.services.father;

import com.example.design.builder.interfaces.Item;

public abstract class Burger implements Item {

    @Override
    public String packing() {
        return new Wrapper().packing();
    }

    @Override
    public abstract float price();
}
