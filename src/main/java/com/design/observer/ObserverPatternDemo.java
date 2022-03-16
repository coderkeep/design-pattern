package com.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式案例
 *
 * @author zhangneng
 */
public class ObserverPatternDemo {

    /**
     * 有推拉两种模式，推的模式是在通知的时候直接把值传过去，
     * 拉的模式是被通知者自己去获取对应的值
     *
     * @param args
     */
    public static void main(String[] args) {
        Subject subject = new Subject();
        // 监听者获取对象实现监听
        new CustomObserverA(subject);
        subject.setState(111);
    }

    public static class Subject {

        private List<CustomObserver> customObserverList = new ArrayList<>();

        private Integer state;

        public void setState(Integer state) {
            this.state = state;
            this.notifyObservers();
        }

        public void attach(CustomObserver observer) {
            this.customObserverList.add(observer);
        }

        public void notifyObservers() {
            customObserverList.forEach(observer -> {
                observer.update();
            });
        }

    }

    /**
     * 观察者
     */
    public static abstract class CustomObserver {

        protected Subject subject;

        public abstract void update();
    }

    public static class CustomObserverA extends CustomObserver {

        /**
         * 注册对应的监听者
         *
         * @param sub
         */
        public CustomObserverA(Subject sub) {
            this.subject = sub;
            sub.attach(this);
        }

        @Override
        public void update() {
            System.out.println("监听者A接收到信息");
            System.out.println("当前值" + subject.state);
        }
    }
}
