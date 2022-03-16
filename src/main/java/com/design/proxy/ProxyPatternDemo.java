package com.design.proxy;

/**
 * 代理模式案例
 *
 * @author zhangneng
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Subject concreteSubject = new ConcreteSubject();
        ProxySubject proxySubject = new ProxySubject(concreteSubject);
        proxySubject.request();
    }

    public interface Subject {
        /**
         * 请求方法
         */
        void request();
    }

    public static class ConcreteSubject implements Subject {

        @Override
        public void request() {
            System.out.println("执行具体的功能");
        }
    }

    public static class ProxySubject implements Subject {

        private Subject subject;

        public ProxySubject(Subject sub) {
            this.subject = sub;
        }

        @Override
        public void request() {
            System.out.println("这是代理类执行功能");
            subject.request();
        }
    }
}
