package com.qzw.week8;

import org.junit.Test;

import static org.junit.Assert.*;

public class SuperStarTest {
    SuperStar ss = new SuperStar("张学友");

    @Test
    public void actFilm() {
        ss.actFilm();
    }

    @Test
    public void sing() {
        ss.sing();
    }

    @Test
    public void showTV() {
        ss.showTV();
    }
}