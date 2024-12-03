package com.leo.pattern.bridge;

/**
 * @author leijiong
 * @version 1.0
 */
public class Mac extends OperatingSystem{
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
