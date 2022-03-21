package com.design.adapter;

/**
 * 扩展类实现类
 *
 * @author zhangneng
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void play(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }
}
