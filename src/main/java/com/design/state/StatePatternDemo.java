package com.design.state;

import java.util.Objects;

/**
 * 状态模式
 * 将状态的管理和切换逻辑全部转移到 context 对象中处理。
 * 类比 有限状态机
 *
 * @author zhangneng
 */
public class StatePatternDemo {

    public static void main(String[] args) {

        StateContext stateContext = new StateContext();

        stateContext.changeState(1);
        stateContext.changeState(2);

    }

    public static class StateContext {

        private State state;

        public void changeState(Integer type) {
            if (type.equals(1)) {
                state = new StateA();
                state.doAction();
            } else if (Objects.equals(type, 2)) {
                state = new StateB();
                state.doAction();
            } else {
                System.out.println("没有找到类型对应的状态值");
            }
        }
    }


    public interface State {

        void doAction();
    }

    public static class StateA implements State {
        @Override
        public void doAction() {
            System.out.println("状态A的执行方法");
        }
    }

    public static class StateB implements State {
        @Override
        public void doAction() {
            System.out.println("状态B的执行方法");
        }
    }
}
