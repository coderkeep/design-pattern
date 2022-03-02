package com.design.factorymethod;

/**
 * 具体的产品逻辑类
 *
 * @author zhangneng
 */
public class ConcreteProduct implements IproductFunc {

    @Override
    public void productFunc() {
        System.out.println("这是具体的产品逻辑");
    }
}
