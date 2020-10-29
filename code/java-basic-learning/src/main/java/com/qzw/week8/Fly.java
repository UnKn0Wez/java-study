package com.qzw.week8;

/**
 * @ClassName Fly
 * @Description TODO
 * @Author UnKnW
 * @Date 2020/10/29
 **/
public interface Fly {
    String NAME = "波音737";
    int SPEED = 2000;

    /**
     * 飞行方法
     *
     * @param name
     * @param speed
     */
    void fly(String name,int speed);
}
