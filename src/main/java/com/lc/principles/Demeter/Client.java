package com.lc.principles.Demeter;

/**
 * @author: L.C
 * @date: 2023/10/28 1:18
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Agent agent = new Agent();

        Star star = new Star("林青霞");
        agent.setStart(star);

        Fans fans = new Fans("里斯");
        agent.setFans(fans);

        Company company = new Company("黑马媒体公司");
        agent.setCompany(company);

        agent.meeting();
        agent.business();
    }
}
