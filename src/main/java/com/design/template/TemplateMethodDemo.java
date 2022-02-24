package com.design.template;

public class TemplateMethodDemo {

    public static void main(String[] args) {
        CricketGame cricketGame = new CricketGame();
        cricketGame.play();
        FootballGame footballGame = new FootballGame();
        footballGame.play();
    }
}
