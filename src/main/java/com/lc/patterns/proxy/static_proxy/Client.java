package com.lc.patterns.proxy.static_proxy;

/**
 * @author: L.C
 * @date: 2023/10/31 21:35
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        ProxyPoint proxyPoint = new ProxyPoint();
        proxyPoint.sell();
    }
}
