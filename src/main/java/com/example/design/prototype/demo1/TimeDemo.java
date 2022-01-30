package com.example.design.prototype.demo1;

public class TimeDemo {

    /**
     * Clone方法原理：
     * Object类的clone方法的原理是从内存中（具体地说就是堆内存）以二进制流的方式进行拷贝，
     * 重新分配一个内存块，那构造函数没有被执行也是非常正常的了
     * <p>
     * clone实现方法：
     * 1、被克隆的类必须自己实现Cloneable 接口，以指示 Object.clone() 方法可以合法地对该类实例进行按字段复制。
     * Cloneable 接口实际上是个标识接口，没有任何接口方法。
     * 2、覆盖Object.clone()方法。
     *
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        test1();
        System.out.println("--------------------------");
        test2();
    }

    public static void test1() throws CloneNotSupportedException {
        Character character = new Character("高兴", 10);
        long start = System.currentTimeMillis();
        User user1 = new User(character);
        for (int i = 0; i < 10; i++) {
            User user = user1.clone();
            user.setName("小明");
            user.setAge(10);
        }
        long end = System.currentTimeMillis();
        System.out.println("用时:" + (end - start));
    }

    public static void test2() {
        Character character = new Character("高兴", 10);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            User user = new User(character);
            user.setName("小明");
            user.setAge(10);
        }
        long end = System.currentTimeMillis();
        System.out.println("用时:" + (end - start));
    }

}
