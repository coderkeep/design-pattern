package com.design.adapter;

import java.util.Objects;

/**
 * 实现新接口类，兼容旧接口类
 *
 * @author zhangneng
 */
public class AudioPlayerAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    @Override
    public void play(String audioType, String fileName) {
        // 实现新接口方法
        if ("vlc".equals(audioType)) {
            advancedMediaPlayer = new VlcPlayer();
        } else if ("mp4".equals(audioType)) {
            advancedMediaPlayer = new Mp4Player();
        }
        if (Objects.isNull(advancedMediaPlayer)) {
            throw new RuntimeException("\"Invalid media. \" +\n" +
                    "                    audioType + \" format not supported\"");
        }
        this.advancedMediaPlayer.play(fileName);
    }
}
