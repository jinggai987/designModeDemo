package com.example.design.prototype.demo1;

import lombok.Data;

/**
 * 1、被克隆的类必须自己实现Cloneable 接口，以指示 Object.clone() 方法可以合法地对该类实例进行按字段复制。
 * Cloneable 接口实际上是个标识接口，没有任何接口方法。
 * 2、覆盖Object.clone()方法。
 */
@Data
public class User implements Cloneable {

    private String name;
    private Integer age;
    private String cName;
    private Integer cDepth;

    public User(Character character) {
        this.cName = character.getName();
        this.cDepth = character.getDepth();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }
}
