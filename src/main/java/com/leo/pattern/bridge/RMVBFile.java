package com.leo.pattern.bridge;

/**
 * @author leijiong
 * @version 1.0
 */
public class RMVBFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb文件：" + fileName);
    }
}
