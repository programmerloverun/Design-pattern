package com.leo.pattern.proxy.cglib_proxy;

/**
 * @author leijiong
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        //创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        //获取代理对象
        TrainStation proxyObject = factory.getProxyObject();

        proxyObject.sell();
    }
}
