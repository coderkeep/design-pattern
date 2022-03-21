package com.design.adapter;

/**
 * 扩展类实现类
 *
 * @author zhangneng
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void play(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
