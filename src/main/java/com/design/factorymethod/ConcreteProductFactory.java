package com.design.factorymethod;

import com.design.factory.IProduct;

/**
 * 具体的方法实现类
 *
 * @author zhangneng
 */
public class ConcreteProductFactory {

    public static IproductFunc get() {
        return new ConcreteProduct();
    }

}
