package com.example.design.prototype.demo1;

import lombok.Data;

@Data
public class Character {

    private String name;
    private Integer depth;

    public Character(String name, Integer depth) {
        this.name = name;
        this.depth = depth;
    }

}
