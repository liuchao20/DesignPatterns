package com.lc.patterns.facade;

/**
 * @author: L.C
 * @date: 2023/11/4 17:33
 * @description: 外观类，用户主要与该对象进行交互
 */
public class SmartApplicationFacade {
    //聚合电灯、电视机、空调
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartApplicationFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    //通过语音控制
    public void say(String message){
        if (message.contains("打开")) {
            on();
        }else if (message.contains("关闭")) {
            off();
        }else {
            System.out.println("我还听不懂你说的");
        }
    }

    private void on(){
        light.on();
        tv.on();
        airCondition.on();
    }

    private void off(){
        light.off();
        tv.off();
        airCondition.off();
    }
}
