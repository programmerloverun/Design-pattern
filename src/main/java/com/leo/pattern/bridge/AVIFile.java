package com.leo.pattern.bridge;

/**
 * @author leijiong
 * @version 1.0
 */
public class AVIFile implements VideoFile {

    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件：" + fileName);
    }
}
