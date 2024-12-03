package com.leo.pattern.bridge;

/**
 * @author leijiong
 * @version 1.0
 */
public class Windows extends OperatingSystem{
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
