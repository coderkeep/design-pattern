package com.design.prototype;

import lombok.Data;

/**
 * 具体的原型类
 *
 * @author zhangneng
 */
@Data
public class ConcretePrototype {

    private String field1;

    private String field2;

    @Override
    public ConcretePrototype clone() {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setField1(this.field1);
        concretePrototype.setField2(this.field2);
        return concretePrototype;
    }
}
