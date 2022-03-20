package com.design.strategy;

import java.util.Stack;

/**
 * 策略模式
 *
 * @author zhangneng
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {

        StrategyContext strategyContext = new StrategyContext();
        StrategyA strategyA = new StrategyA();
        strategyContext.setStrategy(strategyA);
        strategyContext.execute();

        StrategyB strategyB = new StrategyB();
        strategyContext.setStrategy(strategyB);
        strategyContext.execute();

    }

    public static class StrategyContext {

        private Strategy strategy;

        public void setStrategy(Strategy strategy) {
            this.strategy = strategy;
        }

        public void execute() {
            strategy.execute();
        }

    }


    public interface Strategy {

        /**
         * 执行逻辑
         */
        void execute();
    }

    public static class StrategyA implements Strategy {

        @Override
        public void execute() {
            System.out.println("策略A的执行逻辑");
        }

    }

    public static class StrategyB implements Strategy {

        @Override
        public void execute() {
            System.out.println("策略B的执行逻辑");
        }

    }

}


