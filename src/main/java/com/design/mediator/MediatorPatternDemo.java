package com.design.mediator;


import lombok.Data;

/**
 * 中介者模式案例
 *
 * @author zhangneng
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        MouduleA mouduleA = new MouduleA(mediator);
        MouduleB mouduleB = new MouduleB(mediator);
        MouduleC mouduleC = new MouduleC(mediator);
        mouduleC.invokeAB();
        mouduleB.invokeAC();
        mouduleA.invokeBC();
    }

    @Data
    public static class Mediator {

        private MouduleA moudleA;

        private MouduleB mouduleB;

        private MouduleC mouduleC;

        public void invokeBC() {
            mouduleB.execute();
            mouduleC.execute();
        }

        public void invokeAB() {
            moudleA.execute();
            mouduleB.execute();
        }

        public void invokeAC() {
            moudleA.execute();
            mouduleC.execute();
        }

    }

    public static abstract class AbstractMoudule {

        private Mediator mediator;

        public AbstractMoudule(Mediator mediator) {
            this.mediator = mediator;
        }

        public Mediator getMediator() {
            return this.mediator;
        }

        public abstract void execute();

    }

    public static class MouduleA extends AbstractMoudule {

        public MouduleA(Mediator mediator) {
            super(mediator);
            this.getMediator().setMoudleA(this);
            System.out.println("模块A通知中介者");
        }

        @Override
        public void execute() {
            System.out.println("模块A的执行方法");
        }

        public void invokeBC() {
            this.getMediator().invokeBC();
        }
    }

    public static class MouduleB extends AbstractMoudule {
        public MouduleB(Mediator mediator) {
            super(mediator);
            this.getMediator().setMouduleB(this);
            System.out.println("模块B通知中介者");
        }

        @Override
        public void execute() {
            System.out.println("模块B的执行方法");
        }

        public void invokeAC() {
            this.getMediator().invokeAC();
        }

    }

    public static class MouduleC extends AbstractMoudule {

        public MouduleC(Mediator mediator) {
            super(mediator);
            this.getMediator().setMouduleC(this);
            System.out.println("模块C通知中介者");
        }

        @Override
        public void execute() {
            System.out.println("模块C的执行方法");
        }

        public void invokeAB() {
            this.getMediator().invokeAB();
        }

    }

}
