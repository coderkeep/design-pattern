package com.design.abstractfactory;

import com.design.abstractfactory.product.IProductA;
import com.design.abstractfactory.product.IProductB;

/**
 * A1B1产品组合
 *
 * @author zhangneng
 */
public class ProductA1B1Factory extends ProductAbstractFactory {

    @Override
    public IProductA getProductA() {
        return ProductAFactory.createA1();
    }

    @Override
    public IProductB getProductB() {
        return ProductBFactory.createB1();
    }
}
