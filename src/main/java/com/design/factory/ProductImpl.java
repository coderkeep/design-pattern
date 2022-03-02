package com.design.factory;

/**
 * 产品类的某一个实现，实际使用这个类的地方可以更换为其他的类
 * 为什么可以更换，因为都实现了同一个接口
 *
 * @author zhangneng
 */
public class ProductImpl implements IProduct {

    @Override
    public void execute() {
        System.out.println("产品类的实现");
    }
}
