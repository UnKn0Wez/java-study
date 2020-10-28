package com.qzw.week7.homework;

/**
 * @ClassName Test
 * @Description TODO
 * @Author UnKnW
 * @Date 2020/10/28 20:17
 **/
public class Test {
    public static void main(String[] args) {
        Point pow1 = new Point(3,2);
        Point pow2 = new Point(9,6);
        System.out.println(pow1.distance(pow2));
        Circle ran = new Circle(3,5,3);
        ran.center(pow1);
    }
}
