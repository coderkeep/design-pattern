package com.design.abstractfactory;


import com.design.abstractfactory.product.IProductA;
import com.design.abstractfactory.product.IProductB;

/**
 * 抽象工厂类，获取类与类之间的组合
 *
 * @author zhangneng
 */
public abstract class ProductAbstractFactory {

    /**
     * 获取产品A
     *
     * @return
     */
    public abstract IProductA getProductA();

    /**
     * 获取产品B
     *
     * @return
     */
    public abstract IProductB getProductB();
}
