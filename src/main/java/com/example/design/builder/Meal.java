package com.example.design.builder;

import com.example.design.builder.interfaces.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> list = new ArrayList<>();

    public void addItem(Item item) {
        list.add(item);
    }

    public float getCost() {
        float cost = 0;
        for (Item item : list) {
            cost += item.price();
        }
        return cost;
    }

    public void showItem() {
        for (Item item : list) {
            System.out.print(item.name()+",");
            System.out.print(item.price()+",");
            System.out.println(item.packing());
        }
    }
}
