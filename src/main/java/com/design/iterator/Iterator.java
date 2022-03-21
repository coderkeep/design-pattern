package com.design.iterator;

/**
 * 迭代器
 *
 * @author zhangneng
 */
public interface Iterator<T> {

    /**
     * 是否有下一个元素
     *
     * @return
     */
    boolean hasNext();

    /**
     * 获取写一个元素
     *
     * @return
     */
    T next();
}
