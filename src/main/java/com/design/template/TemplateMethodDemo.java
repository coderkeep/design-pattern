package com.design.template;

/**
 * 测试类
 *
 * @author zhangneng
 */
public class TemplateMethodDemo {

    public static void main(String[] args) {
        CricketGame cricketGame = new CricketGame();
        // 公共的 play方法
        cricketGame.play();
        FootballGame footballGame = new FootballGame();
        footballGame.play();
    }
}
