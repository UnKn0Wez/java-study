package com.qzw.week8;

import org.junit.Test;

import static org.junit.Assert.*;

public class FlyTest {
    Fly fly = new Bird();
    @Test
    public void fly() {
        fly.fly("布谷鸟",20);
        fly = new Plane();
        System.out.println("------------------------");
        fly.fly("波音747",3500);
    }
}