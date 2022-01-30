package com.example.design.builder.services.father;

import com.example.design.builder.interfaces.Packing;

public class Wrapper implements Packing {

    @Override
    public String packing() {
        return "Wrapper";
    }
}
