package com.lc.principles.OpenAndClosed;

/**
 * @author: L.C
 * @date: 2023/10/27 22:38
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        //创建搜狗输入法对象
        SougouInput input = new SougouInput();
        //创建皮肤对象
        //DefaultSkin skin = new DefaultSkin();
        HeimaSkin skin = new HeimaSkin();
        //将皮肤设置到输入法中
        input.setSkin(skin);
        //显示皮肤
        input.display();
    }
}
