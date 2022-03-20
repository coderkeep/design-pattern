package com.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式
 *
 * @author zhangneng
 */
public class CompositePatternDemo {

    public static void main(String[] args) {

        Component children = new Component();
        Component component = new Component();

        component.add(children);
        component.execute();

    }

    public static class Component {

        private List<Component> children = new ArrayList<>();

        /**
         * 这里容易产生递归调用
         *
         * @param ch
         */
        public void add(Component ch) {
            this.children.add(ch);
        }

        public void remove(Component children) {
            children.remove(children);
        }

        public void execute() {
            for (Component com : children) {
                com.operate();
            }
        }

        public void operate() {
            System.out.println("具体类的执行逻辑");
        }

    }


}
