package com.design.prototype;

public class PrototypePatternDemo {

    public static void main(String[] args) {
        // 自己处理自己类的创建逻辑
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setField1("值1");
        concretePrototype.setField2("值2");
        ConcretePrototype clone = concretePrototype.clone();
        System.out.println(clone.getField1());
        System.out.println(clone.getField2());
    }
}
