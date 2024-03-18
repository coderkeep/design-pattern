package com.design.factorymethod;

public class FactoryMethodDemo {

    public static void main(String[] args) {
        // 通过 creator 封装工厂的公共执行逻辑
        // 线执行 creator 中公共部分，再通过具体的工厂方法创建对象
        new ConcreteProductCreator().create();
    }
}
