package com.design.template;

/**
 * 模板父类
 *
 * @author zhangneng
 */
public abstract class Game {

    /**
     * 子类实现类
     */
    public abstract void startPlay();

    public void play() {
        startPlay();
        System.out.println("---游戏进行中---");
        endPlay();
    }

    /**
     * 子类实现类
     */
    public abstract void endPlay();

}
