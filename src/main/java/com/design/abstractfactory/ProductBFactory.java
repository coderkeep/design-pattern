package com.design.abstractfactory;

import com.design.abstractfactory.product.*;

/**
 * @author zhangneng
 */
public class ProductBFactory {

    public static IProductB createB1() {
        return new ProductImplB_1();
    }

    public static IProductB createB2() {
        return new ProductImplB_2();
    }
}

