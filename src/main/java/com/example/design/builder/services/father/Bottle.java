package com.example.design.builder.services.father;

import com.example.design.builder.interfaces.Packing;

public class Bottle implements Packing {
    @Override
    public String packing() {
        return "Bottle";
    }
}
