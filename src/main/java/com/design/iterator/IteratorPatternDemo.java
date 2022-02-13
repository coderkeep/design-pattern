package com.design.iterator;

/**
 * @author zhangneng
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        Iterator iterator = new ContainerRepository().getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
