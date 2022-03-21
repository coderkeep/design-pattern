package com.design.factory;

/**
 * 工厂方法
 *
 * @author zhangneng
 */
public class IProductFactory {

    public static IProduct createProduct() {
        // 扩展点
        return new ProductImpl();
    }

}
