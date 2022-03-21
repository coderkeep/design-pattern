package com.design.singleton;

/**
 * 基于双重校验和 volatile 关键字的双重校验机制
 *
 * @author zhangneng
 */
public class SafeFullSingleton {

    /**
     * volatile解决可见性和有序性的问题
     */
    private static volatile SafeFullSingleton instance;

    /**
     * 私有化实例方法
     */
    private SafeFullSingleton() {

    }

    public static SafeFullSingleton getInstance() {
        // 已经初始化之后的请求
        if (instance == null) {

            // 如果有多个线程的并发
            synchronized (SafeFullSingleton.class) {
                // 多个线程同时进入到这里，要做判断逻辑，保证只有一个线程会初始化
                // synchronized 关键字加锁保证了线程执行的顺序性，这里要再加一层限制，判断只要一个线程会初始化对象
                if (instance == null) {
                    // 初始化对象的过程可能会有多步
                    // 通过 volatile 关键字保证执行的顺序性
                    /**
                     * 第一步是给 singleton 分配内存空间；
                     * 然后第二步开始调用 Singleton 的构造函数等，来初始化 singleton；
                     * 最后第三步，将 singleton 对象指向分配的内存空间（执行完这步 singleton 就不是 null 了）。
                     * 这里需要留意一下 1-2-3 的顺序，因为存在指令重排序的优化，也就是说第2 步和第 3 步的顺序是不能保证的，最终的执行顺序，可能是 1-2-3，也有可能是 1-3-2。
                     */
                    instance = new SafeFullSingleton();
                }
            }
        }
        return instance;
    }

    public void execute() {
        System.out.println("这是双重校验单例模式对象的执行方法");
    }
}
