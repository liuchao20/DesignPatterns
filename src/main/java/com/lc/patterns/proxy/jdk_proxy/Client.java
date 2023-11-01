package com.lc.patterns.proxy.jdk_proxy;

/**
 * @author: L.C
 * @date: 2023/10/31 21:53
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        //获取代理对象
        //创建代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory();
        //通过代理工厂对象的方法获取代理对象
        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();

        System.out.println(proxyObject.getClass());

    }
}
