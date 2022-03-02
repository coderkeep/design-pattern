package com.design.abstractfactory;

/**
 * 抽象工厂类
 *
 * @author zhangneng
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        // 将产品的组合通过抽象工厂定义，也就是通过抽象工厂解耦
        ProductAbstractFactory productA1B1Factory = new ProductA1B1Factory();
        productA1B1Factory.getProductA().execute();
        productA1B1Factory.getProductB().execute();

        ProductAbstractFactory productA2B2Factory = new ProductA2B2Factory();
        productA2B2Factory.getProductA().execute();
        productA2B2Factory.getProductB().execute();

    }
}
