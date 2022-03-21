package com.design.factorymethod;

/**
 * 公共的抽象类
 *
 * @author zhangneng
 */
public abstract class ProductCreator {

    public void create() {
        System.out.println("产品公共执行逻辑");
        init();
    }

    /**
     * 各个产品各自的初始化逻辑
     */
    public abstract void init();

}
