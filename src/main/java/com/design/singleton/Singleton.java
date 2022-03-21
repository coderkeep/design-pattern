package com.design.singleton;

/**
 * 通过静态内部类的机制
 *
 * @author zhangneng
 */
public class Singleton {
    private Singleton() {
    }

    /**
     * 通过静态内部类的机制，也就是通过 JVM 的机制保证类只会被加载一次
     */
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();

        /**
         * 既然是静态内部类，那怎么去初始化数据
         */
        static {

        }
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
