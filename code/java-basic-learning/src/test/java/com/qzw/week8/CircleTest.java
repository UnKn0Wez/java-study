package com.qzw.week8;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    BaseShape shape = new Circle(3);

    @Test
    public void getName() {

        shape.getName();
    }

    @Test
    public void getArea() {
        System.out.println(shape.getArea());
    }

    @Test
    public void printArea() {
    }
}