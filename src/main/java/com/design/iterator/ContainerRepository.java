package com.design.iterator;

import java.util.Arrays;
import java.util.List;

/**
 * 容器实现类
 *
 * @author zhangneng
 */
public class ContainerRepository implements Container {

    private List<String> data = Arrays.asList("Robert", "John", "Julie", "Lora");

    @Override
    public Iterator getIterator() {
        return new ContainerIterator();
    }

    private class ContainerIterator implements Iterator<String> {

        private Integer index;

        public ContainerIterator() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return data.size() > index;
        }

        @Override
        public String next() {
            return data.get(index++);
        }
    }

}
