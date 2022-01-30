package com.example.design.builder.services.father;

import com.example.design.builder.interfaces.Item;

public abstract class ColdDrink implements Item {

    @Override
    public String packing() {
        return new Bottle().packing();
    }

    @Override
    public abstract float price();

}
