package com.design.builder;

/**
 * 具体产品的 builder 逻辑
 *
 * @author zhangneng
 */
public class ConcreteProductBuilder implements IBuilder {

    private ConcreteProduct product = new ConcreteProduct();

    @Override
    public ConcreteProductBuilder setField1(String val) {
        product.setField1(val);
        return this;
    }

    @Override
    public ConcreteProductBuilder setField2(String val) {
        product.setField2(val);
        return this;
    }

    public ConcreteProduct create() {
        return product;
    }
}
