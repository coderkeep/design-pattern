package com.design.abstractfactory;

import com.design.abstractfactory.product.IProductA;
import com.design.abstractfactory.product.ProductImplA_1;
import com.design.abstractfactory.product.ProductImplA_2;

import java.io.InputStream;

/**
 * @author zhangneng
 */
public class ProductAFactory {

    public static IProductA createA1() {
        return new ProductImplA_1();
    }

    public static IProductA createA2() {
        return new ProductImplA_2();
    }
}

