package com.design.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 享元模式
 *
 * @author zhangneng
 */
public class FlyweightPatternDemo {

    public static void main(String[] args) {
        Function key1 = FlyweightFactory.getFunction("key1");
        key1.execute();
        Function key2 = FlyweightFactory.getFunction("key1");
        key2.execute();
        System.out.println(key1 == key2);
    }


    public interface Function {

        void execute();
    }

    public static class FunctionImpl implements Function {

        @Override
        public void execute() {
            System.out.println("实体类的执行方法");
        }
    }

    public static class FlyweightFactory {

        private static Map<String, Function> functionMap = new HashMap<>();

        public static Function getFunction(String key) {
            Function function = functionMap.get(key);
            if (Objects.isNull(function)) {
                function = new FunctionImpl();
                functionMap.put(key, function);
            }
            return function;

        }
    }
}
