package com.design.adapter;

public class AudioPlayer implements MediaPlayer {

    private AudioPlayerAdapter audioPlayerAdapter;

    @Override
    public void play(String audioType, String fileName) {
        audioPlayerAdapter = new AudioPlayerAdapter();
        // audio 内置的播放功能
        if ("mp3".equals(audioType)) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        // 利用 adapter 扩展的播放功能
        else if ("vlc".equals(audioType)) {
            audioPlayerAdapter.play(audioType, fileName);
        } else if ("mp4".equals(audioType)) {
            audioPlayerAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " +
                    audioType + " format not supported");
        }
    }
}
