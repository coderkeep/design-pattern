package com.design.singleton;

/**
 * 多线程的问题就线程执行的上下文改变了
 *
 * @author zhangneng
 */
public class UnSafeFullSingleton {

    private UnSafeFullSingleton instance;


    private UnSafeFullSingleton() {
    }

    public UnSafeFullSingleton getInstance() {
        // 在线程并发的情况下，上下文的信息改变
        // 这种情况不是线程安全的，主要原因是线程并发的过程，不清楚线程切换的时机
        if (instance == null) {
            instance = new UnSafeFullSingleton();
        }
        return instance;
    }

    public void execute() {
        System.out.println("线程不安全模式的单例类的执行方法");
    }

}
