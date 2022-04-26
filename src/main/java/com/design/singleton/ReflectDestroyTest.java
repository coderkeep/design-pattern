package com.design.singleton;

import java.lang.reflect.Constructor;

/**
 * 通过反射调用构造方法，破话单例模式，获取对象
 *
 * @author zhangneng
 */
public class ReflectDestroyTest {

    public static void main(String[] args) throws Exception {
        Class<SafeFullSingleton> clazz = SafeFullSingleton.class;
        Constructor<SafeFullSingleton> declaredConstructor = clazz.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        SafeFullSingleton singleton1 = declaredConstructor.newInstance();
        SafeFullSingleton singleton2 = declaredConstructor.newInstance();
        System.out.println(singleton1 == singleton2);
    }
}
