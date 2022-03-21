package com.design.chain;

import java.util.logging.Handler;

/**
 * 责任链模式
 *
 * @author zhangneng
 */
public class ResponsibilityChainPattern {

    public static void main(String[] args) {

        // handlerA持有handlerB的引用，处理自己的调用关系
        HandlerA handlerA = new HandlerA(new HandlerB());
        handlerA.execute();

    }

    public static abstract class Handler {

        protected Handler successor;

        public Handler(Handler handler) {
            this.successor = handler;
        }

        abstract void execute();

    }

    public static class HandlerA extends Handler {

        public HandlerA() {
            super(null);
        }

        public HandlerA(Handler handler) {
            super(handler);
        }

        @Override
        void execute() {
            System.out.println("这是 handlerA 的执行逻辑");
            if (successor != null) {
                successor.execute();
            }
        }
    }

    public static class HandlerB extends Handler {

        public HandlerB() {
            super(null);
        }

        public HandlerB(Handler handler) {
            super(handler);
        }

        @Override
        void execute() {
            System.out.println("这是 handlerB 的执行逻辑");
            if (successor != null) {
                successor.execute();
            }
        }
    }

}
