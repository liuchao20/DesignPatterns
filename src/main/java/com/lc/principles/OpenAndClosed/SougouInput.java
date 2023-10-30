package com.lc.principles.OpenAndClosed;

/**
 * @author: L.C
 * @date: 2023/10/27 22:36
 * @description: 搜狗输入法
 */
public class SougouInput {

    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }
}
