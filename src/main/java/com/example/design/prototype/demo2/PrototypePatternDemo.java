package com.example.design.prototype.demo2;


public class PrototypePatternDemo {

    public static void main(String[] args) {
        WordDocument wordDocument = new WordDocument();
        wordDocument.setText("文本");
        wordDocument.addImages("图片1");
        wordDocument.addImages("图片2");
        wordDocument.addImages("图片3");
        System.out.println(wordDocument.toString());

        WordDocument wordDocument2 = wordDocument.clone();
        System.out.println(wordDocument2.toString());

        wordDocument2.setText("修改文本");
        wordDocument2.addImages("haha");

        System.out.println(wordDocument.toString());
        System.out.println(wordDocument2.toString());


    }
}
