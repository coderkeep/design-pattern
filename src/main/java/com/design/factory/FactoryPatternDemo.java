package com.design.factory;

/**
 * 简单工厂模式，主要是创建单个的产品。
 * 主要还是针对创建接口实现类的场景
 *
 * @author zhangneng
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        // 单个产品，面向的接口的方法
        IProduct product = IProductFactory.createProduct();
        product.execute();
    }

}
