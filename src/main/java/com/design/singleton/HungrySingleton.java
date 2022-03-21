package com.design.singleton;

/**
 * 单例类
 *
 * @author zhangneng
 */
public class HungrySingleton {

    /**
     * 类加载器+类，标识唯一性。多个 classLoader 下的问题
     */
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

    public void execute() {
        System.out.println("单例类的执行方法");
    }
}
