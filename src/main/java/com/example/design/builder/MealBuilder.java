package com.example.design.builder;

import com.example.design.builder.services.Baishi;
import com.example.design.builder.services.ChikenBurger;
import com.example.design.builder.services.Coco;
import com.example.design.builder.services.VegBurger;

public class MealBuilder {

    public Meal preparVegBurger() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coco());
        return meal;
    }

    public Meal preparNoVegBurger() {
        Meal meal = new Meal();
        meal.addItem(new ChikenBurger());
        meal.addItem(new Baishi());
        return meal;
    }
}
