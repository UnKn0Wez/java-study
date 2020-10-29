package com.qzw.week8;

import org.junit.Test;

import static org.junit.Assert.*;

public class BaseShapeTest {

    @Test
    public void print() {
        BaseShape bs = new BaseShape() {
            @Override
            public double getArea() {
                return 0;
            }
        };
        bs.getName();
        //assertEquals("hello",name);
    }
}