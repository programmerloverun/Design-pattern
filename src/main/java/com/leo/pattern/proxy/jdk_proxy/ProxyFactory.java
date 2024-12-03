package com.leo.pattern.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author leijiong
 * @version 1.0
 */
public class ProxyFactory {

    private TrainStation station = new TrainStation();

    public  SellTickets getProxyObject() {
        SellTickets sellTickets = (SellTickets)
                Proxy.newProxyInstance(station.getClass().getClassLoader(), station.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代理点收取一些服务费用（JDK动态代理方式）");
                        Object result = method.invoke(station, args);
                        return result;
                    }
                });
      return sellTickets;
    }
}
