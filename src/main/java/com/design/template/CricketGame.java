package com.design.template;

/**
 * 实现类
 *
 * @author zhangneng
 */
public class CricketGame extends Game {

    @Override
    public void startPlay() {
        System.out.println("开始玩CricketGame");
    }

    @Override
    public void endPlay() {
        System.out.println("CricketGame结束");
    }
}
