package com.qzw.week7.homework;

/**
 * @ClassName Cycle
 * @Description TODO
 * @Author UnKnW
 * @Date 2020/10/28 19:47
 **/
public class Circle extends Point {
    private int r;

    public Circle() {
        super();
        System.out.println("Circle被初始化");
    }

    public Circle(int a, int b, int r) {
        super(a, b);
        this.r = r;
    }
    public void center (Point b){
        if(this.distance(b)<this.r){
            System.out.println("该点在圆上");
        }else if(this.distance(b)==this.r){
            System.out.println("该点在圆边上");
        }else{
            System.out.println("该点不在圆上");
        }
    }
}
