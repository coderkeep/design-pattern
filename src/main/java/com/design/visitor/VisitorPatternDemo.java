package com.design.visitor;

/**
 * 访问者模式
 *
 * @author zhangneng
 */
public class VisitorPatternDemo {


    public static void main(String[] args) {

        VisitorImpl visitor = new VisitorImpl();
        ConcreteComponent concreteComponent = new ConcreteComponent();
        concreteComponent.accept(visitor);
    }


    public interface Visitor {

        void execute(Component component);
    }

    public static class VisitorImpl implements Visitor {
        @Override
        public void execute(Component component) {
            component.state = "OK";
            System.out.println("执行对component的访问逻辑," + component.state);
        }
    }

    /**
     * 定义好接口，接收对对象的访问逻辑
     */
    public static abstract class Component {

        protected String state;

        abstract void accept(Visitor visitor);

    }

    public static class ConcreteComponent extends Component {

        @Override
        void accept(Visitor visitor) {
            visitor.execute(this);
        }
    }


}
