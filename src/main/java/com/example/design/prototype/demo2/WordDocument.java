package com.example.design.prototype.demo2;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;

/**
 * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
 * 深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。
 *  简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。clone明显是深复制，clone出来的对象是是不能去影响原型对象的
 *
 */
@Data
@ToString
public class WordDocument implements Cloneable{

    private String text;
    private ArrayList list = new ArrayList<>();

    //原始拷贝方法 浅拷贝
//    @Override
//    protected WordDocument clone() {
//        WordDocument document = null;
//        try {
//            document = (WordDocument) super.clone();
//            document.text = this.text;
//            document.list = this.list;
//            return document;
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
    //深拷贝--建议使用
    @Override
    protected WordDocument clone() {
        WordDocument document = null;
        try {
            document = (WordDocument) super.clone();
            document.text = this.text;
            //对list使用coloen
            document.list = (ArrayList) this.list.clone();
            return document;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addImages(String img) {
        this.list.add(img);
    }

}
