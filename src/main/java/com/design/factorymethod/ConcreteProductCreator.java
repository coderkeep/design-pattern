package com.design.factorymethod;

/**
 * 具体的产品创建类
 *
 * @author zhangneng
 */
public class ConcreteProductCreator extends ProductCreator {

    @Override
    public void init() {
        ConcreteProductFactory.get().productFunc();
    }
}
