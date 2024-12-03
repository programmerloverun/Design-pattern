package com.leo.pattern.proxy.static_proxy;

/**
 * @author leijiong
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        ProxyPoint p = new ProxyPoint();
        p.sell();
    }
}
