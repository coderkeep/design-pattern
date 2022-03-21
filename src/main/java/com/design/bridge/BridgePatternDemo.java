package com.design.bridge;

/**
 * 桥接模式
 *
 * @author zhangneng
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        // 将两个接口的依赖关系通过桥，也就是接口来解耦
        // 两个依赖类之间通过接口来实现解耦
        Function function = new FunctionImpl();
        Abstraction abstraction = new FunctionClient(function);
        abstraction.execute();
    }

    public interface Function {

        void execute();

    }

    public static class FunctionImpl implements Function {

        @Override
        public void execute() {
            System.out.println("模式方法具体的执行类");
        }
    }

    public static abstract class Abstraction {

        private Function function;

        public Abstraction(Function function) {
            this.function = function;
        }

        public void execute() {
            function.execute();
        }
    }

    public static class FunctionClient extends Abstraction {

        public FunctionClient(Function function) {
            super(function);
        }
    }

}
