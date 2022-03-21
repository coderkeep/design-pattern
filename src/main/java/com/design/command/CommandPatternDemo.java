package com.design.command;

/**
 * 命令模式，封装具体的对象和调用者
 *
 * @author zhangneng
 */
public class CommandPatternDemo {

    public static void main(String[] args) {

        Invoker invoker = new Invoker();

        Command commandA = new CommandA();
        Command commandB = new CommandB();

        invoker.setCommand(commandA);
        invoker.execute();

        invoker.setCommand(commandB);
        invoker.execute();

    }


    public static class Invoker {

        private Command command;

        public void setCommand(Command command) {
            this.command = command;
        }

        public void execute() {
            command.execute();
        }
    }


    public interface Command {
        /**
         * 执行
         */
        void execute();
    }

    public static class CommandA implements Command {
        @Override
        public void execute() {
            System.out.println("这是命令A的执行逻辑");
        }
    }

    public static class CommandB implements Command {
        @Override
        public void execute() {
            System.out.println("这是命令B的执行逻辑");
        }
    }


}
