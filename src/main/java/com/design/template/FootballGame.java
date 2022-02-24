package com.design.template;

public class FootballGame extends Game{

    @Override
    public void startPlay() {
        System.out.println("football start");
    }

    @Override
    public void endPlay() {
        System.out.println("football end");
    }
}
