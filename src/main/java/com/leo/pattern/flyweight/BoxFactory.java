package com.leo.pattern.flyweight;

import java.util.HashMap;

/**
 * @author leijiong
 * @version 1.0
 */
public class BoxFactory {

    private static HashMap<String, AbstractBox> map;

    public BoxFactory() {
        map = new HashMap<>();
        AbstractBox i = new IBox();
        AbstractBox o = new OBox();
        AbstractBox l = new LBox();
        map.put("L", l);
        map.put("O", o);
        map.put("I", i);
    }

    public static final BoxFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder{
        private static final BoxFactory INSTANCE = new BoxFactory();


    }public AbstractBox getShape(String str) {
        return map.get(str);
    }
}
