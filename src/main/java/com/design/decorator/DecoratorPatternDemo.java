package com.design.decorator;

import java.util.function.Function;

/**
 * 装饰器模式
 * 要增强某个类的功能：
 * 1. 可以用装饰器模式，装饰类增加同一个接口
 * 2. 可以用代理，动态代理和继承都是使用此种方式
 *
 * @author zhangneng
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {

        FunctionImplDecorator functionImplDecorator = new FunctionImplDecorator(new FunctionImpl());
        functionImplDecorator.execute();

    }

    public interface Function {
        void execute();
    }

    public static class FunctionImpl implements Function {
        @Override
        public void execute() {
            System.out.println("方式实现类的执行逻辑");
        }
    }

    public static class FunctionImplDecorator implements Function {

        private Function function;

        public FunctionImplDecorator(Function function) {
            this.function = function;
        }

        @Override
        public void execute() {
            System.out.println("方法实现类的前置逻辑");
            function.execute();
            System.out.println("方法实现类的后置逻辑");
        }
    }


}
