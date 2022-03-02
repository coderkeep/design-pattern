package com.design.abstractfactory.product;

import com.design.abstractfactory.product.IProductA;

/**
 * @author zhangneng
 */
public class ProductImplA_1 implements IProductA {

    @Override
    public void execute() {
        System.out.println("产品实现类A_1的执行逻辑");
    }
}
