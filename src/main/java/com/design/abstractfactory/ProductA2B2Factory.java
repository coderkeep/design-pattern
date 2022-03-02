package com.design.abstractfactory;

import com.design.abstractfactory.product.IProductA;
import com.design.abstractfactory.product.IProductB;

/**
 * A1B1产品组合
 *
 * @author zhangneng
 */
public class ProductA2B2Factory extends ProductAbstractFactory {

    @Override
    public IProductA getProductA() {
        return ProductAFactory.createA2();
    }

    @Override
    public IProductB getProductB() {
        return ProductBFactory.createB2();
    }
}
