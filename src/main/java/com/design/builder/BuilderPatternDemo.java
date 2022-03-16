package com.design.builder;

/**
 * 构建者模式
 *
 * @author zhangneng
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {
        // 把具体怎么创建对象的流程交给具体的实现类去处理
        ConcreteProduct concreteProduct = new ConcreteProductBuilder().setField1("值1").setField2("值2").create();
    }
}
