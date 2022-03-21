package com.design.memento;

/**
 * 备忘录模式
 *
 * @author zhangneng
 */
public class MementoPatternDemo {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.prepare();

        // 通过 memento 和 caretaker 保留中间数据
        Memento memento = originator.createMemento();
        Caretaker caretaker = new Caretaker();
        caretaker.saveMemento(memento);

        originator.executeA();
        Memento memento1 = caretaker.retriveMemento();
        originator.setMemento(memento1);
        originator.executeB();

    }

    public interface Memento {

    }

    public static class MementoImpl implements Memento {

        private String state;

        public MementoImpl(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }

    public static class Caretaker {

        private Memento memento;

        public void saveMemento(Memento memento) {
            this.memento = memento;
        }

        public Memento retriveMemento() {
            return this.memento;
        }
    }

    public static class Originator {

        private String state;

        public void prepare() {
            this.state = "中间数据";
        }

        public void executeA() {
            System.out.println("基于中间数据【" + state + "】进行了A方法的执行");
            state += "，A方法的结果数据";
        }

        public void executeB() {
            System.out.println("基于中间数据【" + state + "】进行了B方法的执行");
            state += "，B方法的结果数据";
        }

        public Memento createMemento() {
            return new MementoImpl(state);
        }

        /**
         * 将中间结果数据还原
         *
         * @param memento
         */
        public void setMemento(Memento memento) {
            MementoImpl mementoImpl = (MementoImpl) memento;
            this.state = mementoImpl.getState();
        }
    }
}
