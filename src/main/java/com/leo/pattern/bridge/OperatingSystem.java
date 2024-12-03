package com.leo.pattern.bridge;

/**
 * @author leijiong
 * @version 1.0
 */
public abstract class OperatingSystem {

    protected VideoFile videoFile;


    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }


    public abstract void play(String fileName);


}
