package com.lc.principles.Demeter;

/**
 * @author: L.C
 * @date: 2023/10/28 1:11
 * @description:
 */
public class Agent {
    private Star star;
    private Fans fans;
    private Company company;

    public void setStart(Star star) {
        this.star = star;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    //和粉丝见面的方法
    public void meeting() {
        System.out.println(star.getName() + "和粉丝" + fans.getName() + "见面");
    }

    public void business() {
        System.out.println(star.getName() + "和" + company.getName() + "洽谈");
    }
}
