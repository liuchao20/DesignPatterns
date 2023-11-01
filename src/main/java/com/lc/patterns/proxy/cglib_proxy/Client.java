package com.lc.patterns.proxy.cglib_proxy;

/**
 * @author: L.C
 * @date: 2023/10/31 23:10
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        //创建代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory();
        TrainStation proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
    }
}
